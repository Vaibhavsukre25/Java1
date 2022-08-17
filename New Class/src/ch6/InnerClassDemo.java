package ch6;

public class InnerClassDemo {
	public static void main(String[] args) {
		
Outer.Inner inn=new Outer.Inner();
		
		inn.met();
		
		Outer.Inner2 inn2=new Outer().new Inner2();
		inn2.met();
	}
}
class Outer{
	int i;
	void meeeet() {
		
	}
	//inner class
	static class Inner{
		public void met() {
			//meeeeet();
			System.out.println("static inner method,,,,....");
		}
	}
	
	class Inner2{
		public void met() {
			meeeet();
			System.out.println("inner method..............."+i);
		}
	}
}