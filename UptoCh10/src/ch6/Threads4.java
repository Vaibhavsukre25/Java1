package ch6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threads4 {
	public static void main(String[] args) throws Exception {
	
		ExecutorService es = Executors.newFixedThreadPool(5);
		es.execute(()->{SingleTon.createObject();});
		es.execute(()->{SingleTon.createObject();});
		es.execute(()->{SingleTon.createObject();});
		es.execute(()->{SingleTon.createObject();});
		es.execute(()->{SingleTon.createObject();});
		es.execute(()->{SingleTon.createObject();});
		
		es.shutdown();
		
	}

}
 class SingleTon{
	 private SingleTon() {
		System.out.println("SingleTon cons called.....");
	}
	 private static SingleTon single;
	 
	 /*synchronized*/ static SingleTon createObject() {
		 if(single==null) {
			 single = new SingleTon();
		 }
		 return single;
	 }
 }