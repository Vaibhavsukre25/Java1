package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkList {
	
	public static void main(String args[]) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}
}