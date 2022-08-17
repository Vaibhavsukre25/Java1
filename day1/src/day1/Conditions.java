package day1;

public class Conditions {
public static void main(String[] args) {
	int i=10;
	
	//int result=i%2;
			
	//System.out.println(result);
	
	//boolean res=(result==0);
	//System.out.println(res);
	 
	//boolean res2=((i%2)==0);
	//System.out.println(res2);
	
	//String s=(res2)?"Even number...":"Odd Number....";
	
	//System.out.println(s);
	
	//System.out.println((res2)?"Even number...":"Odd Number....");
	//1st way----AND
	 if(i%2==0) {
		 System.out.println("Even Number...");
	 }
	if(i%2!=0) {
	System.out.println("Odd number...");
	}
	
	//2nd way----OR
	if(i%2==0) {
		System.out.println("Even Number...");
	}
	else {
		System.out.println("Odd Number...."); 
	}
	
	
	
	
	
}
}
