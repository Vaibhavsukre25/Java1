
package runall;

public class Anno1{
public static void main(String[] args) {
	
	System.out.println(	/*
	 * import java.lang.reflect.Field;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


public class Anno1 {
	public static void main(String[] args)throws Exception {
		Knife knife=OEM.createKnife();
		
		knife.useKnife();
	}
}
class OEM{
	public static Knife createKnife() throws Exception{
		Knife knife=new Knife();
		
		Class c=knife.getClass();
		Field f=c.getDeclaredField("handle");
		In in=f.getAnnotation(In.class);
		if(in!=null) {
			String className=in.className();
			Handle handle=(Handle)Class.forName(className).newInstance();
			//dependency injection
			knife.setHandle(handle);
		}
		
		return knife;
	}
}
class Knife{
	@In(className = "runall.WoodenHandle")//meta data or my customer requirement
	private Handle handle;
	
	public Handle getHandle() {
		return handle;
	}
	public void setHandle(Handle handle) {
		this.handle = handle;
	}
	public void useKnife() {
		handle.useHandle();
	}
}
abstract class Handle{
	public abstract void useHandle();
}
class WoodenHandle extends Handle{
	@Override
	public void useHandle() {
		System.out.println("wooden handle used....");
	}
}
class SilverHandle extends Handle{
	@Override
	public void useHandle() {
		System.out.println("silver handle used....");
	}
}

	 */);
}
}
