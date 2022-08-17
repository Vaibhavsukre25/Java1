package runall;

public class ClassObject4 {
	public static void main(String[] args) {
		
Box jukeBox=new Box();
		
		System.out.println("Color of JukeBox..:"+jukeBox.getColor());
		
		jukeBox.setColor("RED");
		
		System.out.println("Color of JukeBox..:"+jukeBox.getColor());
	}
}
class Box{
	String color="BLUE";
	
	public void setColor(String c) {//set method is accepting a parameter of type string
		color=c;
	}
	public String getColor() {
		return color;
	}

}
