package inheritance;

public class SingleLevelInheritance {
	public static void main(String[] args) {
		
		Triangle tri = new Triangle();
		tri.area();
		tri.area(10, 2);
		
	}

}

class shape{
	public void area() {
		System.out.println("Display area.......");
	}
}

class Triangle extends shape{
	public void  area(int l,int b) {
		double c = l*b/2;
		System.out.println(c);
	}
}