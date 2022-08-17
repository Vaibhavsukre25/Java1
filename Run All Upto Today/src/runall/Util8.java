package runall;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class Util8 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map=new TreeMap<String, String>(new MyComparator());
		
		map.put("a100", "ramu");
		map.put("b200","monu");
		map.put("c300","somu");
		map.put("d400","jonu");
		map.put("e500","munnu");
		
		System.out.println(map);
		
		Set<Map.Entry<String,String>> set=map.entrySet();
		
		Iterator<Map.Entry<String,String>> iter=set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String,String> me=iter.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
		
		
		System.out.println(map.get("e500"));
	}
}