package runall;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class Reflection2 {
	public static void main(String[] args) throws Exception{
		Thief thief=new Thief();
		
		//Introspection
		Class c=thief.getClass();
		Field f=c.getDeclaredField("gold");
		f.setAccessible(true);
		System.out.println(f.get(thief));
		
		Method m=c.getDeclaredMethod("howToSteal");
		m.setAccessible(true);
		m.invoke(thief);
	}
}
class Thief{
	private String gold="under the tree....";
	private void howToSteal() {
		System.out.println("steal when people are fooled....");
	}
}

