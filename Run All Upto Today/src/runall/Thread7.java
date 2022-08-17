package runall;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread7 {
	
	  public static void main(String[] args) {
		ReservationCounter central=new ReservationCounter();
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new BookingJob(central,"ram",1000));
		es.execute(new BookingJob(central,"rahim",500));
		
		es.shutdown();
	}
}
class BookingJob implements Runnable{
	ReservationCounter counter;String name;int amt;
	public BookingJob(ReservationCounter counter,String name,int amt) {
		this.counter=counter;
		this.name=name;
		this.amt=amt;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		synchronized(counter) {
			counter.bookTicket(amt);
			counter.giveChange();
		}
	}
}
class ReservationCounter{
	int amt;
	public void bookTicket(int amt) {
		this.amt=amt;
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Ticket booked by..:"+name+"..for amt..:"+amt);
	}
	public void giveChange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("change given...to "+name+"...."+(amt-100));
	
	/*
	 * public static void main(String[] args) {
		ReservationCounter central=new ReservationCounter();
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new BookingJob(central,"ram",1000));
		es.execute(new BookingJob(central,"rahim",500));
		
		es.shutdown();
	}
}
class BookingJob implements Runnable{
	ReservationCounter counter;String name;int amt;
	public BookingJob(ReservationCounter counter,String name,int amt) {
		this.counter=counter;
		this.name=name;
		this.amt=amt;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		counter.bookTicket(amt);
		counter.giveChange();
	}
}
class ReservationCounter{
	int amt;
	public void bookTicket(int amt) {
		this.amt=amt;
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Ticket booked by..:"+name+"..for amt..:"+amt);
	}
	public void giveChange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("change given...to "+name+"...."+(amt-100));
	 */
	
	}
}

