package runall;

public class ClassObject10 {
	public static void main(String[] args) {
		
Laddu myLaddu=new Laddu();
		
		PBV pbv=new PBV();
		System.out.println("Before PBV...:"+myLaddu.size);
		pbv.accept(myLaddu.size);//value size is passed in PBV
		System.out.println("After PBV...:"+myLaddu.size);
		
		PBR pbr=new PBR();
		System.out.println("Before PBR...:"+myLaddu.size);
		pbr.accept(myLaddu);//Laddu reference is passed in PBR
		System.out.println("After PBR...:"+myLaddu.size);
	}
}
/*
 * Pass By Value and Pass By Reference
*/
class Laddu{
	int size=100;
}
class PBV{
	public void accept(int size) {//primitive type - all primitive types are pass by value
		size=size+100;
	}
}
class PBR{
	public void accept(Laddu laddu) {//complex type - Any java class variable is a complex type
		//all complex types are pass by reference.
		laddu.size=laddu.size+200;
	
	}

}
