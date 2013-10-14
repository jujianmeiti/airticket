package com.airticket.web.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsDateJsonBeanProcessor;

import org.apache.log4j.Logger;

import com.airticket.adapter.DataReceiver;
import com.airticket.bean.RequestView;
import com.airticket.bean.ResponseView;
import com.airticket.biz.IFlightSerchBiz;
import com.airticket.util.SignatureUtils;
import com.airticket.util.StaticData;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FlightSerchAction extends ActionSupport {

	private static Logger logger = Logger.getLogger(FlightSerchAction.class);

	private RequestView view;
	private IFlightSerchBiz flightSerchBiz;
	private DataReceiver groupDataReceiver;
	private DataReceiver eachLowerPriceReceiver;

	// 机票查询
	public String searchFlight() {
		// 必要条件判断
		if (null != view.getSearchType()
				&& !StaticData.EMPTY.equals(view.getSearchType())
				&& null != view.getDepartCity()
				&& !StaticData.EMPTY.equals(view.getDepartCity())
				&& null != view.getArriveCity()
				&& !StaticData.EMPTY.equals(view.getArriveCity())
				&& null != view.getDepartDate()
				&& !StaticData.EMPTY.equals(view.getDepartDate())) {

			// 发送请求 获取 视图信息
			List<ResponseView> viewers = flightSerchBiz.searchFlight(view,StaticData.SERCH_URL, groupDataReceiver);
			// 过滤后的航班信息
			List<ResponseView> filterViews = new ArrayList<ResponseView>();

			// 按时间段筛选航班
			if (null != view.getEarliesDeaprtTime()
					&& null != view.getLastDepartTime()) {
				for (ResponseView responseView : viewers) {
					if (view.getEarliesDeaprtTime().getTime() <= responseView
							.getTakeOffTime().getTime()
							&& responseView.getTakeOffTime().getTime() <= view
									.getLastDepartTime().getTime()) {

						filterViews.add(responseView);
					}
				}
			}

			// 按航空公司筛选航班
			if (null != view.getAirlineDibitCode()
					&& view.getAirlineDibitCode().length >= 0) {
				for (ResponseView responseView : filterViews.size() > 0 ? filterViews
						: viewers) {
					for (String code : view.getAirlineDibitCode()) {
						if (code.equals(responseView.getAirLineCode())) {
							filterViews.add(responseView);
						}
					}

				}
			}

			// 如果没有筛选信息，就返回全部航班信息
			filterViews = filterViews.size() > 0 ? filterViews : viewers;
			// 页面文本框值缓存
			ActionContext context = ActionContext.getContext();
			context.put("viewers", filterViews);
			context.put("depart", view.getDepartCity());
			context.put("departTime",SignatureUtils.formatDate(view.getDepartDate()));
			context.put("arrive", view.getArriveCity());
			context.put("arriveTime",SignatureUtils.formatDate(view.getReturnDate()));
			context.put("type", view.getSearchType());
			if(null!=filterViews){context.put("size", filterViews.size());}
			return SUCCESS;
		} else {
			return NONE;
		}
	}

	// 实时票价查询
	public String loadLine() {
		String msg = "";
		// 必要条件判断
		if (null != view.getDepartCity()
				&& !StaticData.EMPTY.equals(view.getDepartCity())
				&& null != view.getArriveCity()
				&& !StaticData.EMPTY.equals(view.getArriveCity())) {
			Date[] days = SignatureUtils.get30Days();
			List<ResponseView> viewers = flightSerchBiz.searchDaysFlight(days,view, StaticData.SERCH_URL, eachLowerPriceReceiver);
			ResponseView view = null;
			// 按照日期排序
			for (int i = 0; i < viewers.size(); i++) {
				for (int j = 0; j < viewers.size() - i - 1; j++) {
					Date neDate = viewers.get(j).getTakeOffTime();
					Date beDate = viewers.get(j + 1).getTakeOffTime();
					if (beDate.getTime() < neDate.getTime()) {
						view = viewers.get(j);
						viewers.set(j, viewers.get(j + 1));
						viewers.set(j + 1, view);
					}
				}
			}
			
			JsonConfig config = new JsonConfig();
			config.setIgnoreDefaultExcludes(true);
			//日期设为js兼容格式
			config.registerJsonBeanProcessor(Date.class,new JsDateJsonBeanProcessor());
			config.setExcludes(StaticData.FILTER_JSON_STR);
			msg = JSONArray.fromObject(viewers,config).toString();
			ActionContext.getContext().put("lineviews", msg);
			ActionContext.getContext().put("linedepart", this.view.getDepartCity());
			ActionContext.getContext().put("linearrive", this.view.getArriveCity());
		} 
		return null;
	}

	
	
	
	
	/**
	 * 获取用户ip
	 * 
	 * @param request
	 * @return
	 */
	private String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}

		ip += ",";
		String[] ips = ip.split(",");
		for (String str : ips) {
			if (str.equalsIgnoreCase("unknown"))
				continue;
			ip = str;
		}

		return ip;
	}

	// getter and setter
	public IFlightSerchBiz getFlightSerchBiz() {
		return flightSerchBiz;
	}

	public void setFlightSerchBiz(IFlightSerchBiz flightSerchBiz) {
		this.flightSerchBiz = flightSerchBiz;
	}

	public RequestView getView() {
		return view;
	}

	public void setView(RequestView view) {
		this.view = view;
	}

	public DataReceiver getGroupDataReceiver() {
		return groupDataReceiver;
	}

	public void setGroupDataReceiver(DataReceiver groupDataReceiver) {
		this.groupDataReceiver = groupDataReceiver;
	}

	public DataReceiver getEachLowerPriceReceiver() {
		return eachLowerPriceReceiver;
	}

	public void setEachLowerPriceReceiver(DataReceiver eachLowerPriceReceiver) {
		this.eachLowerPriceReceiver = eachLowerPriceReceiver;
	}

}
