package ch6;

public class ArrayVariable {
	public static void main(String[] args) {
		
		int arr[]= {21,32,61,51};
		ArrayVariable obj = new ArrayVariable();
		
		//System.out.println("Before passing .."+ arr[2]);
		//obj.pass(arr);
		//System.out.println("after passing..."+ arr[2]);
		
		//soultion
		//obj.pass(new int[] {21,56,84,98});
		int arrcop[]= new int[4];
		
		System.arraycopy(arr, 0, arrcop, 0, 4);
		
		System.out.println("Before passing .."+ arr[2]);
		obj.pass(arrcop);
		System.out.println("after passing..."+ arr[2]);
		System.out.println(arrcop[2]);
		
	}
	
	void pass(int a[]) {
		a[2]=9999;
	}

}
