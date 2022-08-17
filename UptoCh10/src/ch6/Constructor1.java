package ch6;

public class Constructor1 {
	Constructor1() {
		System.out.println("empty constructor called..........");
	}
	
	Constructor1(int i){
		System.out.println("constructor called with value....."+i);
	}
	
	public static void main(String[] args) {
		new Constructor1();
		new Constructor1(10);
		A obj = new A(100);
		obj.printN();
	}
	

}
class A {
	int n=5;
	public A(int i) {
		System.out.println("cons called.....");
		this.n=i;
	}
	void printN(){
		System.out.println(n);
	}
}
