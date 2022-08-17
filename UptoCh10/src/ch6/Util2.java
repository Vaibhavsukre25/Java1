package ch6;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Util2 {
	public static void main(String[] args) {
		List<Integer> nlist = new ArrayList<>();
		nlist.add(10);
		nlist.add(50);
		nlist.add(100);
		nlist.add(5);
		nlist.add(1000);
		nlist.add(650);
		nlist.add(12);
		System.out.println(nlist);
		Collections.sort(nlist);
		System.out.println(nlist);//Acending order......
		Collections.sort(nlist, new MyComparator());
		System.out.println(nlist);
		
	}

}
// by using mycomparator we can give acending or desending order to interger.....
class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
}