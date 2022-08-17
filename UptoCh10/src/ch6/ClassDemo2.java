package ch6;

public class ClassDemo2 {
	public static void main(String[] args) {
		ClassDemo2 obj = new ClassDemo2();
		
		obj.met();
		obj.met(100);
		obj.met((long)102);
		obj.met2(10, "Vaibhav");
		obj.met3(false);
		int arr[]= {10,20,30,40};
	    obj.met4(arr);
	    obj.met4(new int[] {10,52,12,03});
	    //obj.met5(58,98,69,45);
		obj.met5(new int[] {65,95,76,45});
	}
	
	void met() {
		System.out.println("Met is Called.......");
	}
	void met(int i) {
		System.out.println("Met Called with int parameter.......");
	}
	void met(long l) {
		System.out.println("Met called with long parameter......");
	}
	void met2(int i,String s) {
		System.out.println("...................................");
	}
	void met3(boolean b) {
		System.out.println("booooooooooooooooooooooooo Called.............");
	}
	void met4(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
		for(int i:a) {
			System.out.println(i+"\t");
		}
	}
	void met5(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int i:a) {
			System.out.print(i+"\t");
		}
	}
}