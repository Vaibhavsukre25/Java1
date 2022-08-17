package runall;

public class ClassObject11 {
	public static void main(String[] args) {
		
		Fan khaitan=new Fan();
		State onState=new State();
		onState.changeFanState(khaitan, "on state...");
		
		System.out.println(khaitan.getState());
	}
}
class Fan {
	String state;
	public String getState() {
		return state;
	}
}
class State{
	public void changeFanState(Fan f,String s) {
		f.state=s;
	}

}
