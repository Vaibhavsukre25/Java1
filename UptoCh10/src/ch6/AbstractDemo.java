package ch6;

public class AbstractDemo {

	public static void main(String[] args) {
		Hall hall;
		Hall.mets();
		hall= new PartyHall();
		hall.met();
		if(hall instanceof PartyHall) {
			System.out.println("yes this is Partyhall ");
		}
		
		hall = new MeetingHall();
		hall = new PartyHall();
		if(hall instanceof MeetingHall) {
			System.out.println("Yes this is Meeting Hall");
		}
		else {
			System.out.println("This is not a meeting Hall");
		}
		
		accept(hall);
		accept(new PartyHall());
		accept(new MeetingHall());
	}
	static void accept(Hall hall) {
		System.out.println("party................:"+hall);
	}
	
	static void accept(MeetingHall hall) {
		System.out.println("meeting................:"+hall);
	}

}

abstract class Hall{
	public Hall() {
		System.out.println("cons called....");
	}
	static {
		System.out.println("static block called.....");
	}
	public void met() {
		System.out.println("abstract void met called........");
	}
	public static void mets() {
		System.out.println("abstract void mets called....");
	}	
}

class PartyHall extends Hall{
	public PartyHall() {
		System.out.println("Party Hall Cons called........");
	}
}
	
	class MeetingHall extends Hall{
		public MeetingHall() {
			System.out.println("meeting Hall Cons called........");
		}
	}