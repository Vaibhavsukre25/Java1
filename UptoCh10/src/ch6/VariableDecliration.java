package ch6;

public class VariableDecliration {
	
	int s;
	static int ss;
	void met(int i) {
		System.out.println(i);
	}
	void met2(int ii) {
		System.out.println(ii);
	}
	
	public static void main(String[] args) {
		VariableDecliration obj = new VariableDecliration();
		obj.s=10;
		obj.ss=1000;
		
		
		VariableDecliration obj2 = new VariableDecliration();
		System.out.println(obj.ss+":"+obj2.ss);
		obj2.s=20;
		obj2.ss=2000;
		
		
		System.out.println(obj.s+":"+obj2.s);
		System.out.println(obj.ss+":"+obj2.ss);
		System.out.println(VariableDecliration.ss+":"+VariableDecliration.ss);
		
		obj.met(100);
		VariableDecliration objX=obj;
		objX.met(200);
		System.out.println(obj.s+":"+objX.s);
		
	}

}
