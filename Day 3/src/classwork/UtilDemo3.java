package classwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class UtilDemo3 {
	public static void main(String[] args) {
		List<Emp> list=new LinkedList<>();
		
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
		
		for(Emp e:list) {
			System.out.println(e);
		}
		
		Iterator<Emp> iter=list.iterator();
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