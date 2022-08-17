package runall;

public class Exception3 {
	public static void main(String[] args) {
		
		System.out.println("before exception...");
		try{
			int i=1/0;
			//int i=1/Integer.parseInt(args[0]);
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block called...");
		}
		System.out.println("after exception..");
	}
}
//finally block gets called under all case, whether an exception arises or not and even whether handled or not