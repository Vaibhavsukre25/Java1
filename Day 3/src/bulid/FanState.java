package bulid;

public class FanState {
	public static void main(String[] args) {
		
		Fan khaitan=new Fan();
		for(int i=0;i<5;i++) {
			khaitan.pull();
		}
	}
}
class Fan{
	int state=0;
	public void pull() {
		if(state==0) {
			System.out.println("switch on state....");
			state=1;
		}
		else if(state==1) {
			System.out.println("medium speed state...");
			state=2;
		}
		else if(state==2) {
			System.out.println("high speed state...");
			state=3;
		}
		else {
			System.out.println("switch off state...");
			state=0;
		}
	}
}

