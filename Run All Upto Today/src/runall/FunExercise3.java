package runall;

public class FunExercise3 {
	public static void main(String[] args) {
		
		Fan1 khaitan=new Fan1();
		for(int i=0;i<200;i++) {
			khaitan.pull();
		}
	}
}
class Fan1{
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
