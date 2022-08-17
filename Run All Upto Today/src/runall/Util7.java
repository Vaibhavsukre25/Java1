package runall;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class Util7 {
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		
		set=new TreeSet<>(new MyComparator());
		
		set.add("ram");
		set.add("sham");
		set.add("mohan");
		set.add("johan");
		set.add("ram");
		
		System.out.println(set);
		
		Iterator<String> iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}