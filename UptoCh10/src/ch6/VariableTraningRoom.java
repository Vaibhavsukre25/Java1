package ch6;

public class VariableTraningRoom{
	
	public static void main(String[] args) {
		
		TrainingRoom vaibhav = new TrainingRoom();
		TrainingRoom omi = new TrainingRoom();
		System.out.println(vaibhav.sanio  + ":" + omi.sanio);
		System.out.println(vaibhav.sulab + ":" + omi.sulab);
	}
}

class TrainingRoom{
	Projector sanio = new Projector();
	Toilet sulab = new Toilet();
	
}
class Projector{
	
}
class Toilet{
	
}