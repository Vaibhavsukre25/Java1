package windowr;

public class Looping {
	public static void main(String[] args) {
		
		/*
		 * while (true) {
			System.out.println("Infinite loop...");
		}
		
		 */
        /*
         * do {
			System.out.println("Infinite do while loop...");
		}while(true);		
         */

	    int i=10;
	    while(i>0) {
	    	System.out.println("The value of i is....."+i);
	    	i--;
	    }
	   /*
	    *  do {
	    	System.out.println("Loop is still executed....");
	    }while(i>10);
	    */
	    do {
	    	System.out.println("do while i value is....:"+i);
	    	i++;
	    	
	    }while(i<10);
	}

}
