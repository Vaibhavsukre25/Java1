package ch6;

public class Interface {
	public static void main(String[] args) {
		
		AlopatyMedicalCollege obj = new AlopatyMedicalCollege();
		obj.care();
		obj.cure();
		ChemicalMedicalCollge obj2 = new ChemicalMedicalCollge();
		obj2.cure();
		}
}

class human{
	
}

interface Doctor{
	public void cure();
	
}
interface Nurse{
	public void care();
	
}

class AlopatyMedicalCollege implements Doctor,Nurse{
	@Override
	public void cure() {
		System.out.println("curing is done as per alopaty medicine....");
		
	}
	@Override
	public void care() {
		System.out.println("Careing is done as per alopaty medicine......");
	}
	
}

class ChemicalMedicalCollge implements Doctor{
	@Override
	public void cure() {
		System.out.println("Curing is done as per chemical medicines.....");
		
	}
}