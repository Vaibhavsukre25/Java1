package runall;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class Util10 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String, String>();
		map=new TreeMap<String, String>(new MyComparator());
		
		map.put("s1", "rahim");
		map.put("s2", "ram");
		map.put("s3", "sohail");
		
		System.out.println(map);
		
		System.out.println(map.get("s2"));
		
		Set<Map.Entry<String,String>> set=map.entrySet();
		
		Iterator<Map.Entry<String,String>> iter=set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String,String> me=iter.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
	}
}