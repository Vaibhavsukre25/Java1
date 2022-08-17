package runall;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DynamicObjectReading1 {
	public static void main(String[] args)throws Exception {
		PoliceStation p1=new PoliceStation();
		
		Politician holyMan=new Politician();
		Tailor karim=new Tailor();
		
		p1.arrest(holyMan);
	}
}
class PoliceStation{
	public void arrest(Object o) throws Exception{
		//Normal way of interrogation
		Class c=o.getClass();
		Field f=c.getField("publicName");
		System.out.println(f.get(o));
		
		Method m=c.getMethod("service");
		m.invoke(o);
		
		m=c.getMethod("service",String.class,int.class);
		m.invoke(o, "blablabla",10000);
	}
}
class Politician{
	public String publicName="noble..gold hearted...holy...saver of humanity....";
	public void service() {
		System.out.println("All noble services.......");
	}
	public void service(String name,int num) {
		System.out.println("overloaded service method....."+name+"...."+num);
	}
}
class Tailor{
	public String publicName="karimbhai";
	public void service() {
		System.out.println("making gentlemen...dresses..");
	}
	public void service(String name,int num) {
		System.out.println("overloaded service method....."+name+"...."+num);
	}

}
