package runall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Campare1 {
	public static void main(String[] args) {
		String s1="a";//97
		String s2="c";//98
		
		System.out.println(s2.compareTo(s1));
		
		Test t1=new Test();t1.age=50;
		Test t2=new Test();t2.age=40;
		
		System.out.println(t1.compareTo(t2));
		List<Test> list=new ArrayList<Test>();
		list.add(t1);
		list.add(t2);
		
		Collections.sort(list,new MyCom());
		
		System.out.println(list);
	}
}
class MyCom implements Comparator<Test>{
	@Override
	public int compare(Test o1, Test o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
}
class Test implements Comparable<Test>{
	int age;
	@Override
	public int compareTo(Test o) {
		if(this.age>o.age) {
			return 1;
		}
		else if(this.age<o.age) {
			return -1;
		}
		else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return "Age...:"+age;
	}
}
