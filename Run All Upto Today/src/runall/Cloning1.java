package runall;


public class Cloning1 {
	public static void main(String[] args) {
		//multiton
		Sheep mothersheep=new Sheep();
		Sheep dolly=new Sheep();
		
		mothersheep.name="ia m the mother..";
		dolly.name="iam dolly..";
		
		System.out.println(mothersheep.name+":"+dolly.name);
		
		Sheep mothersheep1=new Sheep();
		Sheep dolly1=mothersheep1;
		
		mothersheep1.name="ia m the mother.111111111.";
		dolly1.name="iam dolly.1111111111.";
		System.out.println(mothersheep1.name+":"+dolly1.name);
		
		Sheep mothersheep2=new Sheep();
		Sheep dolly2=mothersheep2.createClone();
		
		mothersheep2.name="ia m the mother.111111111.";
		dolly2.name="iam dolly.1111111111.";
		System.out.println(mothersheep2.name+":"+dolly2.name);
	}
}
class Sheep implements Cloneable{
	String name;
	public Sheep() {
		System.out.println("sheep cons called.object created..");
	}
	
	public Sheep createClone() {
		try {
			return (Sheep)super.clone();
		}catch(Exception e) {
			return null;
		}
	}
}

