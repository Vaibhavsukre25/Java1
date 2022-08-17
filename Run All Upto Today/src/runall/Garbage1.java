package runall;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;
public class Garbage1 {
	public static void main(String[] args) {
		Item item1=new Item();
		Item item2=new Item();
		
		//WeakReference<Item> wr=new WeakReference<Item>(item1);
		
//		WeakHashMap<Item,String> hm=new WeakHashMap<>();
//		hm.put(item1, "mat");
//		hm.put(item2, "door");
//		System.out.println(hm);
		
		SoftReference<Item> sr=new SoftReference<Item>(item1);
		
		item1=null;
		
		System.gc();
		
		item1=sr.get();
		System.out.println(item1);
		//System.out.println(hm);
	}
}
class Item{
	private int cash=1000000;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called..."+cash+" is in the locker...");
	}
}
