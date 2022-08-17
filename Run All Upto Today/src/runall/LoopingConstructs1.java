package runall;

public class LoopingConstructs1 {
	public static void main(String[] args) {
		
		int i=10;
		//while or do while - run the block of code inside the two flower braces after the condition, until the while condition
		//returns true.
		
		while(i<10) {//the condition is checked first - pre condition check
			System.out.println("hello world...:"+i);
			i++;
		}
		
		i=10;
		do {//the condition is checked later - post condition check
			System.out.println("do while hello world...:"+i);
			i++;
		}while(i<10);
	}

}
