package classwork;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
public class UntilDemo2 {
	public static void main(String[] args) {
		Vector<Emp> list=new Vector<>();//vector is thread safe
		
		System.out.println(list.size());
		
		list.add(new Emp());
		list.add(new Emp());
		list.add(new Emp());
		
		System.out.println(list.size());
		
		list.remove(0);
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			Emp emp=(Emp)list.get(i);
		}	
		
		Enumeration ee=list.elements();
		list.add(new Emp());
		while(ee.hasMoreElements()) {
			System.out.println(ee.nextElement());
		}
		
		for(Emp e:list) {
			System.out.println(e);
		}
		
		Iterator<Emp> iter=list.iterator();
		//list.add(new Emp());
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		ListIterator<Emp> liter=list.listIterator();
		while(liter.hasNext()) {
			System.out.println(liter.next());
		}
		while(liter.hasPrevious()) {
			System.out.println(liter.previous());
		}
	}
}


