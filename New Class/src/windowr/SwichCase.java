package windowr;

public class SwichCase {
	public static void main(String[] args) {
		
		int marks =70;
		
		switch(marks) {
		default:{
			System.out.println("no comment....");
			break;
			
		}
		case 40:{
			System.out.println("Just Pass...");
			break;
			}
		case 60:{
			System.out.println("Frist class...");
			
		}
		case 70:{
			System.out.println("Good Marks");
		}
		}
		System.out.println("Called...");
		
		
	    char c='b';
	    switch(c) {
	    case 'a':{
	    	System.out.println("a for apple");
	    }
	    case 'b':{
	    	System.out.println("b for ball");
	    }
	    }
	    
	}

}
