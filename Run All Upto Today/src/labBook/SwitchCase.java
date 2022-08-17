package labBook;

import java.util.Scanner;

public class SwitchCase {
   public static void main(String[] args) {
	
	   Scanner vvs = new Scanner(System.in);
	   System.out.println("Enter a tech number....");
	   int tech = vvs.nextInt();
	   
	 //  int tech =1;
	   switch(tech) {
	   case 1:{
		   System.out.println("Java......");
		   break;
	   }
	   case 2:{
		   System.out.println("Python....");
		   break;
	   }
	   case 3:{
		   System.out.println("C laguage...");
		   break;
	   }
	   default :{
		   System.out.println("Not listed here.....");
	   }
	   }
}
}
