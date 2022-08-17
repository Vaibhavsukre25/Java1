package ch6;

public class InnerClassDemo {

	public static void main(String[] args) {
		Outer.Inner Inn = new Outer.Inner();
		Outer.Inner1 Inn2 = new Outer().new Inner1();
		Inn.met();
		Inn2.met();
				
		
	}
}

class Outer{
	int i=10;
	void meeet(){
		
	}
	static class Inner{
		public void met() {
			//meeet();
			System.out.println("Inner classes called........");
		}
	}
	class Inner1{
		public void met() {
			meeet();
			System.out.println("Inner2 called............."+i);
		}
	}
}
