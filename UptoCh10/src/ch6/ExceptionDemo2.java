package ch6;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("Before exception....");
		
		LLRDriver somu = new LLRDriver();
		try {
		somu.drive("bumpy");
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("After Exception......");
	}

}

class LLRDriver{
	public void drive(String road) throws Exception{
		System.out.println("normal driving.....");
		if(road.equals("bumpy")) {
			throw new Exception();
		}
	}
}