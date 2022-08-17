package runall;

public class Conditions4 {
	public static void main(String[] args) {
		
		/*
		 * unlike if-else and ternary, switch takes a value.
		 */
		
		int i=100;
		switch(i) {
		case 10:{
			System.out.println("you did not score pass marks...");
			break;
		}
		case 40:{
			System.out.println("you are just pass");
			break;
		}
		case 60:{
			System.out.println("you are first class");
			break;
		}
		case 65:{
			System.out.println("above 65");
		}
		default:{
			System.out.println("unknown number....");
			break;
		}
		}
		
		int dayOfWeek=5;
		switch(dayOfWeek) {
		case 0:{System.out.println("Sunday");break;}
		case 1:{System.out.println("Monday");break;}
		case 2:{System.out.println("Tuesday");break;}
		case 3:{System.out.println("Wednesday");break;}
		case 4:{System.out.println("Thursday");break;}
		case 5:{System.out.println("Friday");break;}
		case 6:{System.out.println("Saturday");break;}
		default:{System.out.println("unknown Day..");}
		}
		
		char c='a';
		switch(c) {
		case 'a':{
			System.out.println("a for Allah");
		    break;
		}
		case 'b':{
			System.out.println("b for budha");
			break;
		}
		case 'c':{
			System.out.println("chamundi");
			break;
		}
		case 'd':{
			System.out.println("devi");
		}
		
		}

	}

}
