package ch6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class UtilMap {
	public static void main(String[] args) {
		
		//HashMap<Integer,String > hm = new HashMap<Integer, String>();
		//TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		TreeMap<Integer, String> hm = new TreeMap<Integer, String>((n1,n2)->{return n2.compareTo(n1);});
		hm.put(100, "vaibhav");
		hm.put(200, "sham");
		hm.put(15, "hari");
		hm.put(65, "create");
		System.out.println(hm);
		System.out.println(hm.get(15));
		Set<Map.Entry<Integer,String>> set = hm.entrySet();
		Iterator<Map.Entry<Integer,String>> iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry<Integer, String> me = iter.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}

}
