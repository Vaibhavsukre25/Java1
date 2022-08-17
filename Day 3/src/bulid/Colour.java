package bulid;

public class Colour {
public static void main(String[] args) {
	
	PaintBrush asian=new PaintBrush();
	asian.doPaint(5);
	
	PaintBrush2 asian2=new PaintBrush2();
	asian2.setColour("blue colour...");
	asian2.doPaint();
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
	else if (i>3) {
		System.out.println("Shivaji Maharaj Ke Jay....");
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
