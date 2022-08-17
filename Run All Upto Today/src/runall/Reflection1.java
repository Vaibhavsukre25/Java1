package runall;

import java.util.Scanner;
public class Reflection1 {
	public static void main(String[] args) throws Exception{
		//Temp temp=new Temp();//static
		Hall hall=new BirthDayHall();
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the hall class name..:");
		String classname=scan.next();
		Hall temp=(Hall)Class.forName(classname).newInstance();//dynamic
		
		System.out.println(temp);
	}
}
abstract class Hall{
	public abstract void useHall();
}
class BirthDayHall extends Hall{
	@Override
	public void useHall() {
		System.out.println("using hall for birthday.....");
	}
}
class MarriageHall extends Hall{
	@Override
	public void useHall() {
		System.out.println("using hall for marriage...");
	}
}

