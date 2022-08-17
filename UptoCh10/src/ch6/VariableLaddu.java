package ch6;

public class VariableLaddu {
   public static void main(String[] args) {
	
	Laddu laddu = new Laddu();
	VariableLaddu obj = new VariableLaddu();
	// pass by value
	
	System.out.println("Before Passing..."+laddu.size);
	obj.PBV(laddu.size);
	System.out.println("After Passing...."+laddu.size);
	
	// pass by reference
	System.out.println("Before passing....."+laddu.size);
	obj.pbr(laddu);
	System.out.println("After passing....."+ laddu.size);
	
	   
   }
   void PBV(int size) {
	   size = 5;
   }
   void pbr(Laddu lad) {
	   lad.size=100;
   }
}

class Laddu{
	int size = 10;
}