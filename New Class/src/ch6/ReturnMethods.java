package ch6;

public class ReturnMethods {
   public static void main(String[] args) {
	
	   ReturnMethods obj = new ReturnMethods();
	   
	   int a = obj.call();
	   System.out.println(a);
	   System.out.println(obj.call(10));
	   System.out.println(obj.run());
	   System.out.println("Vaibhav is playing");
	   System.out.println(obj.getName(20));
}
   int call() {
	   return 100;
	   
   }
   long call(int i) {
	   if(i==10) {
		   return 10;
	   }
	   else {
		   return 200;
	   }
   }
   boolean run() {
	   return true;
   }
   String getName(int rollno) {
	   switch(rollno) {
	   case 1:{
		   return "vaibhav";
	   }
	   case 2:{
		   return "Vishal";
	   }
	   default:{
		   return "No person";
		   
	   }
	   }
   }
}
