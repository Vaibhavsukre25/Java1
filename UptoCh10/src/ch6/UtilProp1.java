package ch6;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Properties;

public class UtilProp1 {
	public static void main(String[] args) throws Exception{
		
		Properties prop = new Properties();
		prop.put("a2", "hii");
		prop.put("a4", "bye");
		prop.put("a7","Welcome");
		prop.put("a10", "blabla");
		
		prop.load(new FileInputStream("java.properties"));
		System.out.println(prop);
		
		
		System.out.println(prop);
		
		Enumeration en = prop.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
