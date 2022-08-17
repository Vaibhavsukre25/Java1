package runall;

public class ClassObject12 {
	public static void main(String[] args) {
		
		/*
		 * 1. Arrays are by default pass by reference even for primitive types
		 * 2. Arrays are by default initialized
		 */
		//All local variables are not initialized except arrays
		int n;
		int i[]=new int[5];
		String s[]=new String[5];
		System.out.println(i[2]);
		System.out.println(s[2]);
		
		ClassObject12 obj=new ClassObject12();
		System.out.println("Before Passing Array...:"+i[0]);
		obj.met(i);
		System.out.println("After Passing Array...:"+i[0]);
		
	}
	
	public void met(int arr[]) {
		arr[0]=202020;
	}

}
