package ch6;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
//import java.util.concurrent.FutureTask;

public class Threads3 {
	public static void main(String[] args) throws Exception{
		ExecutorService es = Executors.newFixedThreadPool(1);
		Future<String> future;
		
		future = es.submit(new MyCallable());
		
		try {Thread.sleep(100);}catch(Exception e) {}
		System.out.println("After submit");
		
		String result = future.get();
		System.out.println(result);
		es.shutdown();
		
		
		
	}

}

class MyCallable implements Callable<String>{
	@Override
	public String call() throws Exception {
		System.out.println("call method is executed.....");
		try {Thread.sleep(1000);}catch(Exception e){}
		return "child thread executed";
	}
}