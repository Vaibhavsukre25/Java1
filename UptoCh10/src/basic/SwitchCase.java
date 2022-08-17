package basic;

public class SwitchCase {
	private static final String jan = null;

	public static void main(String[] args) {
		
		int i=400;
		switch(i){
		case 20:{
			System.out.println("I am sorry! you are failed");
			break;
		 }
		case 40:{
			System.out.println("You are just passed....");
			break;
		}
		case 60:{
			System.out.println("You passed with frist class....");
			break;
		}
		case 80:{
			System.out.println("Your marks are very good........");
			break;
		}
		default:{
			System.out.println("Your number until did not come.......");
		}
		}
		
		
		char c='5';
		switch(c) {
		case 'a' :{
			System.out.println(" a for apple......");
			break;
			
		}
		case 'b':{
			System.out.println("b for ball....");
			break;
		}
		default :{
			System.out.println("You entered number is wrong....");
		}
		}
		
	  String str = "jan";
	  
	  switch(str) {
	  case "jan" :{
		  System.out.println("month is januvary.....");
		  break;
	  }
	  case "feb":{
		  System.out.println("month is feburvary.....");
	  }
	  }
	}

}
