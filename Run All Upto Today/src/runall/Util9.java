package runall;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
public class Util9 {
	public static void main(String[] args)throws Exception {
		Properties map=new Properties();
		
	/*
	 * map.put("a100", "ramu");
		map.put("b200","monu");
	map.put("c300","somu");
		map.put("d400","jonu");
		map.put("e500","munnu");
	 */
		
		map.load(new FileInputStream("config.properties"));
		
		System.out.println(map);
		
		Set set=map.entrySet();
		
		Iterator<Map.Entry<String,String>> iter=set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String,String> me=iter.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
		
		
		System.out.println(map.get("a2"));
		
		map.store(new FileOutputStream("copy.properties"), null);
		map.storeToXML(new FileOutputStream("copy.xml"), null);
	}
}