package ch6;

public class InterfaceDemo {
	public static void main(String[] args) {
		
		Human h = new Human();
		
		
	}

}
class Human{
	
}
interface Doctor{
	public void cure();
	
}
interface Nurse {
	public void care ();
	
}
class AlopathyMedicalCollege implements Doctor,Nurse{
	public void cure() {
		System.out.println("curing done as per alopathy medicine...");
	}
	@Override
	public void care() {
		System.out.println("caring done as per alopathy medicine....");
		
	}
}

class UnaniMedicalCollege implements Doctor{
	@Override
	public void cure() {
		System.out.println("curing done as per unani herbal medicine....");
		
	}
}