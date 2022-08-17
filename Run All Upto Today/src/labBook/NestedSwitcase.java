package labBook;

public class NestedSwitcase {
	public static void main(String[] args) {
		
		int tech=2;
		int course =2;
		switch(tech) {
		case 1:{
			System.out.println("Python");
			break;
		}
		case 2:{
			switch(course) {
			case 1:{
				System.out.println("java");
				break;
				
			}
			case 2:{
				System.out.println("Advance Java...");
				break;
			}
			}
			break;
		}
		
		default :{
			System.out.println("Not listed here...");
		}
		}
	}

}
