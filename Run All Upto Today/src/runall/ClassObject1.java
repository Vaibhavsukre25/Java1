package runall;

public class ClassObject1 {
	public static void main(String[] args) {
     int i=10;
		
		Walker w;//I am just creating a reference by name w of type/class Walker
		
		Walker shoiab=new Walker();//new Walker() - creates an object of Walker class
		
		Human john=new Human();
		//shoiab is the reference variable or name of the Walker class Object.
		
		System.out.println(shoiab);
		shoiab.walking();
		
		
	}
}
class Human{}
class Walker{
	//a class can have properties and behaviours
	int n=100;
	
	//methods
	void walking(){
		System.out.println(n);
	}

}
