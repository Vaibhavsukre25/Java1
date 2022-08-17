package ch6;

public class ClassLaddu {
	public static void main(String[] args) {
		ClassLaddu obj = new ClassLaddu();
		Laddua myladdua = new Laddua();
		
		System.out.println("size of laddu"+myladdua.size);
		obj.setsize(myladdua.size);
		System.out.println("Size of laddu after passing...."+ myladdua.size);
		
		System.out.println("size of laddu"+myladdua.size);
		obj.setsize(myladdua);
		System.out.println("Size of laddu after passing...."+ myladdua.size);
		
	}
   void setsize(int size){
	   size = 5;
   }
   void setsize(Laddua laddu) {
	   laddu.size=5;
   }
}

class Laddua{
	int size = 10;
}