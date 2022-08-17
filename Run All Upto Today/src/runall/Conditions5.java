package runall;

public class Conditions5 {
	public static void main(String[] args) {
		
        int i=20;
		
		
		//1st way - AND
		if(i%2==0) {
			System.out.println("Even Number....");
		}
		if(i%2!=0) {//if the expression inside the if is not giving true, then the statement in the if block will not get executed.
			System.out.println("Odd Number....");
		}
		
		//2nd way - OR
		if(i%2==0) {
			System.out.println("even number 2nd way............");
		}
		else {
			System.out.println("odd number 2nd way.............");
		}
		
		//3rd way
		int age=15;
		
		if(age<10) {
			System.out.println("you are below 10...");
		}//AND
		if(age<20) {
			System.out.println("you are below 20...");
		}
		
		if(age<10) {
			System.out.println("you are below 10.....................");
		}//OR
		else if(age<20) {
			System.out.println("you are below 20,............................");
		}
		else if(age<30) {
			System.out.println("you are below 30..............................");
		}
		else {
			System.out.println("you are not matching any condition....");
	}

}
}
