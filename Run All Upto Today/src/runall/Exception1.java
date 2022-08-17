package runall;

public class Exception1 {

	public static void main(String[] args) {
		
		System.out.println("Before exception...");
		try {
			int n=2/Integer.parseInt(args[0]);
		}catch(ArithmeticException e) {
			System.out.println("enter a number other than zero..");
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("please enter a command line argument...");
		}catch(NumberFormatException ne) {
			System.out.println("please enter a value other than character..");
		}
		catch(Exception e) {
			System.out.println("unknown....");
		}
		System.out.println("After exception...");

	}
}
