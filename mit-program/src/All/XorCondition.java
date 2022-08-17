package All;

public class XorCondition {
    public static void main(String[] args) {
		
    	int a=1,b=2,c=3,d=4;
    	System.out.println(a==1 ^ b==2);
    	
    	System.out.println(c==4 ^ d==3);
    	
    	System.out.println(c==4 ^ d==4);
    	
    	char ans= 'y';
    	if(ans=='y') {
    		System.out.println("It is yes..");
    	}
    	else {
    		System.out.println("It is No.....");
    	}
    	
    	int  ans1= 15;
    	if(ans1==15) {
    		System.out.println("\t\tThe number is...");
    	}
    	else {
    		System.out.println("The number is....."+ans1);
    	}
    	
    	
    	int value = 4;
    	if(value !=4 ) {
    		System.out.println("Value is not equal to 10");
    	}
    	else {
    		System.out.println("Value is other than 10");
    	}
	}
}
