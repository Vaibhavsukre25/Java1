package ch6;

public class ArrysVariableDemo {
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40};
		ArrysVariableDemo obj = new ArrysVariableDemo();
		// Arrays are always be pass by reference
		//System.out.println("before passing...:"+arr[2]);
		//obj.pass(arr);//be default arrays are pass by reference		
		//System.out.println("after passing...:"+arr[2]);
		
		//Solution
		int arrcop[]= new int[4];
		System.arraycopy(arr, 0, arrcop, 0, 4);
		System.out.println("before passing...:"+arr[2]);
		obj.pass(arrcop);//be default arrays are pass by reference		
		System.out.println("after passing...:"+arr[2]);
		System.out.println(arrcop[2]);
		
	}
	void pass(int a[]) {
		a[2]=99999;
	}

}
