package onclass;

public class InterfaceDemo1 extends Exception {
	
	CEO sho = new Vaibhav();
	
	//CEO.doWork();
	//sho.work();
	
	

}

interface CEO{
	private void reportToUS() {
		System.out.println("Reporting to US always......");
	}
	private void workForUS() {
		System.out.println("Working for Only US.......");
	}
	private void giveProfitToUS() {
		System.out.println("Give profit to US......");
	}
	default void work() {
		reportToUS();
		workForUS();
		giveProfitToUS();
	}
	static void doWork() {
		System.out.println("do work for US Boss........");
	}
	public void food();
}

class Vaibhav implements CEO{
	@Override
	public void food() {
		System.out.println("Give Samosa and vadapav with chatine.......");
		
	}
}