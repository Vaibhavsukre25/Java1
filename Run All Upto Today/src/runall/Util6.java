package runall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Util6 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("ramu");
		list.add("somu");
		list.add("anwar");
		list.add("basha");
		
		Collections.sort(list,new MyComparator());
		System.out.println(list);
		
		
	}
}
class MyComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
}
