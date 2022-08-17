package classesAndobjects;

public class BasicExample {
	public static void main(String[] args) {
		
		Pen pen1 = new Pen();
		pen1.Colour = "Red";
		pen1.Type = "Gel";
		pen1.Write();
		pen1.TandC();
		Pen pen2 = new Pen();
		pen2.Colour = "Green";
		pen2.Type = "Ballpoint";
		
		pen2.TandC();
	}

}

class Pen{
	String Colour;
	String Type;
	
	public void Write() {
		System.out.println("Writing Something......"+ Colour +"\n" +  Type );
	}
	
	
	public void TandC() {
		System.out.println(this.Type);
		System.out.println(this.Colour);
	}
}