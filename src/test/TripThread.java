package test;

import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import net.sf.ehcache.CacheManager;

public class TripThread {
	
	Logger logger = Logger.getLogger(TripThread.class);
	
	
	public TripThread(){
		for (int i = 0; i < poolSize; i++) {
			threadPool.add(new Thread(handler));
		}
	}
	
	
	//线程池
	private List<Thread> threadPool = new ArrayList<Thread>();
	
	// 线程池容量
	private static Integer poolSize = 100;
	// 线程池增量
//	private static Integer poolUpCount = 10;
	//线程事件类
	private static Runnable handler;
	
	public static void setHandler(Runnable run){
		handler = run;
	}
	
	

	

	/**
	 * 设置线程池初始化线程数量
	 * 
	 * @param size
	 */
	public static void setPoolSize(int size) {
		if(size>0){
			poolSize = size;
		}
		
	}

	/**
	 * 设置线程池线程数量的增量（即线程不够时增加几个线程）
	 * 
	 * @param count
	 */
//	public static void setPoolUpCount(int count) {
//		if(count>=(poolSize/2)&&count<=poolSize){
//			poolUpCount = count;
//		}
//	}

	/**
	 * 设置线程池线程数量
	 * 
	 * @param count
	 */
	public void setThreadCount(int count) {
		threadPool.clear();
		for (int i = 0; i < count; i++) {
			threadPool.add(new Thread(handler));
		}

	}

	
	/*
	 * NEW 至今尚未启动的线程处于这种状态。 RUNNABLE 正在 Java 虚拟机中执行的线程处于这种状态。 BLOCKED
	 * 受阻塞并等待某个监视器锁的线程处于这种状态。 WAITING 无限期地等待另一个线程来执行某一特定操作的线程处于这种状态。
	 * TIMED_WAITING 等待另一个线程来执行取决于指定等待时间的操作的线程处于这种状态。 TERMINATED 已退出的线程处于这种状态。
	 */

	public Thread getFreeThread() {
		for (int i=0,len=threadPool.size();i<len;i++) {
			Thread thread = threadPool.get(i);
			//是否为未启动的线程
			if (thread.getState() == State.NEW) {
				return thread;
			}
			//线程是否已退出,如果退出就将其释放
			if(thread.getState()==State.TERMINATED){
				thread = new Thread(handler);
				threadPool.set(i,thread);
			}
		}
		
		return getFreeThread();
	}
	
	public static CacheManager singletonManager = CacheManager.create();
	
	
	public static void main(String[] args) {
		
		//CacheManager singletonManager = CacheManager.create();
//		Cache memoryOnlyCache = new Cache("allen",50000, false, false, 8, 2);
//		singletonManager.addCache(memoryOnlyCache);
//		Cache test = singletonManager.getCache("allen");
//		
//		System.out.println(test);
		
		//singletonManager.removeCache("allen"); 
		
		
//		FlightSearchRequest sr = new FlightSearchRequest();
//		sr.setSearchType("S");
//		
//		FlightRoute route = new FlightRoute();
//		route.setDepartCity("SHA");
//		route.setArriveCity("BJS");
//		route.setDepartDate("2013-10-10");
//		route.setAirlineDibitCode("");
//		route.setDepartPort("");
//		route.setArrivePort("");
//		route.setEarliestDepartTime("0001-01-01T00:00:00");
//		route.setLatestDepartTime("0001-01-01T00:00:00");
//		
//		
//		List<FlightRoute> routes = new ArrayList<FlightRoute>();
//		routes.add(route);
//		
//		sr.setSendTicketCity("SHA");
//		sr.setIsSimpleResponse("false");
//		sr.setIsLowestPrice("true");
//		sr.setPriceTypeOptions(new String[]{"NormalPrice"});
//		sr.setProductTypeOptions("Normal");
//		sr.setOrderBy("DepartTime");
//		sr.setDirection("ASC");
//		sr.setRoutes(routes);
		
		
	//	String url = "http://openapi.ctrip.com/Flight/DomesticFlight/OTA_FlightSearch.asmx?wsdl";
		
		
	}
	
}
