package runall;

public class ClassObject2 {
	public static void main(String[] args) {
		
int i=10;
		
		Walker w;//I am just creating a reference by name w of type/class Walker
		
		Walker shoiab=new Walker();//new Walker() - creates an object of Walker class
		//shoiab.n=1010101;
		
		System.out.println(shoiab);
		shoiab.walking();
		//int i=shoiab.hai();	
		//System.out.println(shoiab.hai());
	}
}
class man
{
	//a class can have properties and behaviours
	int n=100;
	
	//methods
	void walking(){
		System.out.println("hello");
		System.out.println(n);
	}	
	boolean hai() {
		if(n>=100) {
			return true;
		}
		else {
			return false;
		}
	}

}
