package ch6;


import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Util1 {
	public static void main(String[] args) {
		
		int arr[]= new int[4];
		//ArrayList<String> alist = new ArrayList<String>();
		//LinkedList<String> alist = new LinkedList<String>();
		Vector<String> alist = new Vector<>();
		System.out.println("After creating...."+alist.size());
		alist.add("ram");
		alist.add("lakshaman");
		alist.add("sita");
		System.out.println("After adding....."+alist.size());
		alist.remove(1);
		System.out.println("After removing....."+alist.size());
		System.out.println(alist.get(0)+alist.get(1));
		for(int i=0;i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
		
		Iterator<String> iter = alist.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next()+"000000000");
		}
		
		ListIterator<String> Listiter = alist.listIterator();
		while(Listiter.hasNext()) {
			System.out.println("........"+Listiter.hasNext());
		}
		while(Listiter.hasPrevious()) {
			System.out.println("*************"+Listiter.hasPrevious());
		}
		
		System.out.println(alist.contains("vaibhav"));
		System.out.println(alist);
		
	}

}
