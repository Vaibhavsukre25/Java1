package ch6;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection1 {
	public static void main(String[] args) {
		
		PoliceStation p1 = new PoliceStation();
		Politician p2 = new Politician();
		p1.arrest(p2);
		
	}

}

class PoliceStation{
	public void arrest(Object pol) {
		try {
		Class suspect = pol.getClass();
		Field field = suspect.getField("name");
		System.out.println(field.get(pol));
		
		Method method = suspect.getMethod("service");
		method.invoke(pol);
		
		field = suspect.getDeclaredField("secretName");
		field.setAccessible(true);
		System.out.println(field.get(pol));
		
		method = suspect.getDeclaredMethod("secretService");
		method.invoke(pol);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class Politician{
	public String name = "Good Man";
	private String secretName = "Thief";
	
	public void service() {
		System.out.println("I am for public.........and.......bla bla bla");
	}
	public void secretService() {
		System.out.println("I loot peoples....");
	}
}