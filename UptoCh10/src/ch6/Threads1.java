package ch6;

public class Threads1 {
	public Threads1() {
		new Thread(()->{Threads1.met2(10);}).start();
		new Thread(()->{Threads1.met3();}).start();
	}
	public static void main(String[] args) {
		
		
		System.out.println("frist line....");
		System.out.println("Second line........");
		System.out.println("Third line..........");
		
		new Threads1();
		met1();
		//met2(100);
		//met3();
		
		
	}
	static void met1(){
		
		  System.out.println("met 1 is called.........");
		try {Thread.sleep(5000);}catch(Exception e) {}
	}
	static int met2(int i) {
		System.out.println("met2 is called......"+i);
		return 10;
	}
	static void met3() {
		System.out.println("met 3 is called......");
	}
}

