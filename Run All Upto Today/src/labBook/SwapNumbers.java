package labBook;

public class SwapNumbers {
	public static void main(String[] args) {
		
		int first=5, second=7;
		System.out.println("Befor Swaping");
		System.out.println("first number is....."+first);
		System.out.println("Second nmber is .."+ second);
		
		int temp=first;
		first=second;
		second=temp;
		System.out.println("After swaping....");
		System.out.println("First number is..."+first);
		System.out.println("Seconf number is...."+ second);
	}

}
