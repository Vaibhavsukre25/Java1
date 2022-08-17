package runall;

public class FunExercise1 {
public static void main(String[] args) {
	
	PaintBrush asian=new PaintBrush();
	asian.doPaint(2);
}
}
class PaintBrush{
public void doPaint(int i) {
	if(i==1) {
		System.out.println("red colour..");
	}
	else if(i==2) {
		System.out.println("blue colour...");
	}
	else if(i==3) {
		System.out.println("green colour...");
	}
}
}
