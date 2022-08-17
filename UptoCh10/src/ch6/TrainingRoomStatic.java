package ch6;

public class TrainingRoomStatic {
	public static void main(String[] args) {
	TrainingRoom25 t1 = new TrainingRoom25();
	TrainingRoom25 t2 = new TrainingRoom25();
	
	System.out.println(t1.sayno);
	System.out.println(t2.sayno);
	System.out.println(t1.toilet);
	System.out.println(t2.toilet);
	
	System.out.println(TrainingRoom25.toilet);
	System.out.println(TrainingRoom25.toilet);
		
	}
}

class TrainingRoom25{
	Projector25 sayno = new Projector25();
	static Toilet25 toilet = new Toilet25();
}
class Projector25{
	
}
class Toilet25{
	
}