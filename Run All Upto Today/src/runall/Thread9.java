package runall;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread9 {
	public static void main(String[] args) {
		
		TraRoom tr=new TraRoom();
		TraRoom tr2=new TraRoom();
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new ToletJob(tr,"ramu"));
		es.execute(new ToletJob(tr2,"somu"));
		
		es.shutdown();
	}
}
class ToletJob implements Runnable{
	String name;TraRoom room;
	public ToletJob(TraRoom room,String name) {
		this.name=name;
		this.room=room;
	}
	@Override
	public void run() {
		synchronized(TraRoom.class) {
			Thread.currentThread().setName(name);
			room.tolet.useToilet();
		}
	}
}
class TraRoom{
	static Tolet tolet=new Tolet();
}
class Tolet{
	public void useToilet() {
		String name=Thread.currentThread().getName();
		
		System.out.println(name+" is using the toilet...");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println(name+" is out of toilet...");
	}

}
