package ch6;

public class VariableDemo3 {
	public static void main(String[] args) {
		
		TrainingRoom netaji = new TrainingRoom();
		TrainingRoom shastri = new TrainingRoom();
		System.out.println(netaji.vaibhav+":"+shastri.vaibhav);
        System.out.println(netaji.sulab+":"+shastri.sulab);
        System.out.println(TrainingRoom.sulab+":"+TrainingRoom.sulab);
	}
	
}

class TrainingRoom{
	Projector vaibhav = new Projector();
	static Toilet sulab = new Toilet();
	
	
}
class Projector{
	
}
class Toilet{
	
}