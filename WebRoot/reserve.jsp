<%@page import="java.math.BigDecimal"%>
<%@page import="com.airticket.bean.ResponseView"%>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<script type="text/javascript"src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js"></script>
<script type="text/javascript"src="/airticket/js/map.js"></script>
<script type="text/javascript"src="/airticket/js/person.js"></script>
<script type="text/javascript"src="/airticket/js/personView.js"></script>

<script type="text/javascript">
	$(function() {
		var persons = new Map();
		new PersonView(0,persons).laod();
		var count = 0;
		
		$("#addPerson").click(function() {
			var size = persons.size();
			if (size >= 9) {
				alert("最多只能添加9个乘客!");
				return;
			}
			++count;
			new PersonView(count, persons).laod();
		});
		
		

	})();
</script>
</head>
<body>

	<s:if test="#reserveViews!=null">
		<s:iterator var="reView" value="#reserveViews">
			<form id="updateform" action="" method="post">
				<input type="hidden" name="view.price" value="<s:property value="#reView.price" />"/>
			<input type="hidden" name="view.flightNo" value="<s:property value="#reView.flightNo" />"/>
			<input type="hidden" name="view.flightClass" value="<s:property value="#reView.flightClass" />"/>
			<input type="hidden" name="view.takeOffTime" value="<s:date name="#reView.takeOffTime" format="yyyy-MM-dd hh:mm:ss"/>"/>

				<s:property value="#reView.depCityDetail.cityName" />
				-
				<s:property value="#reView.arrCityDetail.cityName" />
				<br />
				<s:property value="#reView.depAirportInfo.airPortName" />
				-
				<s:property value="#reView.arrAirportInfo.airPortName" />
				<s:property value="#reView.flightClassName" />
				&nbsp; 还剩
				<s:property value="#reView.quantity" />
				张票 <br /> 实际价格：
				<s:property value="#reView.price" />
				&nbsp; 标准价格：
				<s:property value="#reView.standardPrice" />
				(
				<s:property value="#reView.rate" />
				) &nbsp; 儿童价格：
				<s:property value="#reView.childStandardPrice" />
				&nbsp; 婴儿价格：
				<s:property value="#reView.babyStandardPrice" />
				<br /> 起飞时间：
				<s:date name="#reView.takeOffTime" format="yyyy-MM-dd hh:mm:ss" />
				&nbsp; 航班号：
				<s:property value="#reView.flightNo" />
				&nbsp; 航班类型：
				<s:property value="#reView.craftInfo.craftType" />
				<br />
				<s:property value="#reView.airlineInfo.airLineName" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:void(0);"
					onclick="doDelete()">删除</a> <br />

			</form>
		</s:iterator>
		<%
			//ResponseView responseView=((List<ResponseView>)request.getAttribute("reserveViews")).get(0);

				//BigDecimal sum_price=BigDecimal.valueOf(0);

				//BigDecimal price=responseView.getPrice();
				//BigDecimal childStandardPrice=responseView.getChildStandardPrice();
				//BigDecimal babyStandardPrice=responseView.getBabyStandardPrice();
		%>

		<!-- 总价:&nbsp;<input readonly="readonly" type="text" value="<%//sum_price%>"/> -->


		<br />
		<h2>乘机人信息</h2>
		<hr />
		
		<div id="list_passenger"></div>
		<input id="addPerson" type="button" value="＋添加乘机人">
	</s:if>

	<div>
		<label>总价：</label><span id="localPrice"><s:property value="#reserveViews.get(0).price" /></span>￥
	</div>
</body>
</html>
