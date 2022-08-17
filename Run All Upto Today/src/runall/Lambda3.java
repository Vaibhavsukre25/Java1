package runall;

import java.util.TreeSet;
public class Lambda3 {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>((String o1,String o2)->{return o2.compareTo(o1);});
		
		ts.add("rahim");
		ts.add("ram");
		ts.add("sham");
		ts.add("sam");
		
		System.out.println(ts);
	}
}
