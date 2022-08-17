package ch6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Util4 {
	public static void main(String[] args) {
		//Set<String> myset = new HashSet<String>();
		TreeSet<String> myset = new TreeSet<String>((s1,s2)->{return s2.compareTo(s1);});
		myset.add("ball");
		myset.add("bat");
		myset.add("car");
		myset.add("dog");
		myset.add("java");
		myset.add("java");
		System.out.println(myset);
		
		Iterator<String> iter = myset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
