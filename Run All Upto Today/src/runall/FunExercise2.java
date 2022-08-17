package runall;

public class FunExercise2 {
public static void main(String[] args) {
	
	PaintBrush asian=new PaintBrush();
	asian.doPaint(2);
	
	PaintBrush2 asian2=new PaintBrush2();
	asian2.setColour("blue colour...");
	asian2.doPaint();
}
}
class PaintBrush5{
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
class PaintBrush2{
String color;
public void setColour(String co) {
	color=co;
}
public void doPaint() {
	System.out.println(color);
}
}
