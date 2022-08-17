package ch6;

public class VariableDemo2 {
	
	int s;
	int i=20; long ll=200;
	static int ss;
	void met(int i) {
		System.out.println(i);
	}
	void met(long ll) {
		System.out.println(ll);
	}
   public static void main(String[] args) {
	   
	   VariableDemo2 obj = new VariableDemo2();
	   obj.s=10;
	//   obj.ss=1000;
	   VariableDemo2.ss=1000;
	  
	   VariableDemo2 obj2 = new VariableDemo2();
	   System.out.println(obj.ss+":"+obj2.ss);
	   obj2.s=20;
	   VariableDemo2.ss=2000;
	   
	   System.out.println(obj.s+":"+obj2.s);
	   System.out.println(obj.ss+":"+obj2.ss);
	   System.out.println(VariableDemo2.ss+":"+VariableDemo2.ss);
	   System.out.println(obj.i);
	   System.out.println(obj.ll);
	   System.out.println(obj2.i+":"+obj2.ll);
}
}
