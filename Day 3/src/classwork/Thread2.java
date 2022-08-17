package classwork;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Thread2 {
	public static void main(String[] args) throws Exception{
		System.out.println("first line....");
		//Thread t=new Thread(new ChildThreadRunnableJob());
		//t.start();
		ExecutorService es=Executors.newFixedThreadPool(1);
		//es.execute(new ChildThreadRunnableJob());
		Future f= es.submit(new ChildThreadCallableJob());		
		System.out.println("second line....");
		System.out.println(f.get());
		es.shutdown();
	}
}
class ChildThreadRunnableJob implements Runnable{
	@Override
	public void run() {
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("child thread called..");
	}
}
class ChildThreadCallableJob implements Callable{
	@Override
	public Object call() throws Exception {
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("child thread called..");
		return "the result...";
	}
}

