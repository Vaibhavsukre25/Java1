package ch6;

import java.lang.reflect.Method;

public class Reflection2 {
	public static void main(String[] args) throws Exception {
		
		Hello he = new Hello();
		//Hello hello = (Hello)Class.forName("ch6.Hello").newInstance();
		Hello hello = (Hello)Class.forName("ch6.Hello").getConstructor().newInstance();
		hello = (Hello)Class.forName("ch6.Hello").getConstructor(String.class,int.class).newInstance("vaibhav",25);
		System.out.println(hello);
		
		Method method = hello.getClass().getDeclaredMethod("met", String.class,int.class);
		method.invoke(hello, "java batch",100);
		
		method = hello.getClass().getDeclaredMethod("met");
		method.invoke(hello);
		
	}

}

class Hello{
	public Hello() {
		// TODO Auto-generated constructor stub
	}
	public Hello(String name,int age) {
		System.out.println("Cons called....:"+name +":" + age);
	}
	public void met() {
		System.out.println("met called.....");
	}
	public void met(String s,int i) {
		System.out.println("overloading met called....."+s+":"+i);
	}
	
}