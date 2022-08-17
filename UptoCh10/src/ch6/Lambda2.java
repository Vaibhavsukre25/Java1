package ch6;

public class Lambda2 {
	public static void main(String[] args) {
		MyInterM mm = Lambda2::myHello;
		mm = new Lambda2()::javaHello;
		mm = Lambda2::new;
		hello(mm);
		
	}
	
	static void myHello() {
		System.out.println("this is my hello implemation.....");
	}
	void javaHello() {
		System.out.println("Java hello......imple......");
	}
	public Lambda2() {
		System.out.println("cons callled.......");
	}
	
static void hello(MyInterM m) {
	m.sayHello();
}
}

interface MyInterM{
	public void sayHello();
}