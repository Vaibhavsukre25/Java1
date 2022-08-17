package inheritance;

public class MultiLevelInheritance {
	public static void main(String[] args) {
		
		Triangle1 tri = new Triangle1();
	    circle ccc = new circle();
	    ccc.area();
	    ccc.area(10, 2);
	    ccc.area(5);
	
	
		
	}

}

class shape1{
	public void area() {
		System.out.println("Display area........");
	}
}



class Triangle1 extends shape1{
	public void area(int l,int b) {
		System.out.println(l*b/2);
	}
}

class circle extends Triangle1{
	public void area(int r) {
		System.out.println((3.14)*r*r);
	}
}
