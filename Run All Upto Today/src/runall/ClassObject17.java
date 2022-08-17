package runall;

public class ClassObject17 {
public static void main(String[] args) {
	
	//This is the syntax of creating an object of inner class
			Kalimark.CampaCola campa=new Kalimark().new CampaCola();
			Pepsi pepsiCo=new Pepsi();
			Kalimark kali=new Kalimark();		
			pepsiCo.makeCola(campa);
			kali.makeCola(campa);
		}
	}
	class Pepsi{
		public void makeCola(Kalimark.CampaCola campa) {
			campa.makeCola();
			System.out.println("pepsi fill cola in pepsi bottle and sells");
		}
	}
	class Kalimark{
		public void makeCola(CampaCola campa) {
			campa.makeCola();
			System.out.println("kalimark fill cola in bovonto bottle and sells");
		}
		//INNER CLASS - A WAY TO ACHIEVE ENCAPSULATION
		//campa cola is now a inner class of kalimark
		class CampaCola{
			public void makeCola() {
				System.out.println("cola made by campa cola..");
			}
}
}
