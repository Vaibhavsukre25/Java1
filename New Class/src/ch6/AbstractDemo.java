package ch6;
public class AbstractDemo{
	public static void main(String[] args) {
		Hall hall;
		//hall=new Hall();
		
		//Hall.metS();
		hall = new PartyHall();
		hall.met();
		if(hall instanceof PartyHall) {
			System.out.println("yes this is party hall now....");
		}
		hall=new MeetingHall();
		hall=new PartyHall();
		
		if(hall instanceof MeetingHall) {
			System.out.println("yes this is meeting hall now....");
		}
		else {
			System.out.println("no this is not a meeting hall...");
		}
		accept(hall);
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
		System.out.println("Cons of abs Called...");
	}
	static {
		System.out.println("static blocks of abs called....");
	}
	public void met() {
		System.out.println("Abstract class met....");
	}
	public void metS() {
		System.out.println("Static met of abs called...");
	}
}
class PartyHall extends Hall {
	public PartyHall() {
		System.out.println("Party hall cons called...");
	}
}
class MeetingHall extends Hall{
	public MeetingHall() {
		System.out.println("party hall cons called....");
	}
}