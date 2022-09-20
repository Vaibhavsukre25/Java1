package linkedlist;

import java.util.LinkedList;

public class CollectionFramework {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.addFirst("A");
		list.addFirst("is");
		list.addLast("List");
		System.out.println(list.get(2));
		//list.removeFirst();
		//list.removeLast();
		list.remove();
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i) + " --> ");
		}
		System.out.println("null");
	}

}
