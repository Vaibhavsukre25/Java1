package ch6;

public class VariableDemo1 {
	public static void main(String[] args) {
		Laddu laddu = new Laddu();
		VariableDemo1 vd = new VariableDemo1();
		
		// Pass by value
		System.out.println("Before passing ...."+laddu.size);
		vd.pbv(laddu.size);
		System.out.println("After passing ...."+laddu.size);
		
		//Pass by reference
		System.out.println("Pbr-Before passing ...."+laddu.size);
		vd.pbr(laddu);
		System.out.println("pbr-After passing ...."+laddu.size);
	}


void pbv(int size) {
	size = 5;
   }
void pbr(Laddu lad) {
	lad.size=5;
	
}
}

class Laddu{
	int size = 10;
	
}