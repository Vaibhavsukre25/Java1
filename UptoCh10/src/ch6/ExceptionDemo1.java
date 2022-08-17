package ch6;

public class ExceptionDemo1 {
    public static void main(String[] args) {
		
    	System.out.println("Before exception ......");
    	try {
    	int i=1/Integer.parseInt(args[0]);
    	}catch(ArithmeticException e) {
    		System.out.println("please enter a number other than zero....");
    	}catch(ArrayIndexOutOfBoundsException ee) {
    		System.out.println("Please enter a number excluding zero.....");
    	}
    	catch(Exception aa){
    		System.out.println("unknown exception.....");
    	}
    	finally {
    		System.out.println("finally always printed.....");
    		for(int i=0;i<10;i++) {
    			System.out.println("finally"+i);
    		}
    	}
    	System.out.println("After Exception......");
	}
}
