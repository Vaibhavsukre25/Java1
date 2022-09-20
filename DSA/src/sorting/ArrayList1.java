package sorting;

//import java.util.ArrayList;
import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(2);
		list.add(5);
		System.out.println(list);
		
		System.out.println(list.get(1));
		
		list.add(1, 25);
		System.out.println(list);
		
		list.set(0, 11);
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i) + " ");
			
		}
		
	System.out.println();
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
	}
}
