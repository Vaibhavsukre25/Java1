package runall;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Util4 {
	public static void main(String[] args) {
		
Queue<String> Myq=new PriorityQueue<String>();
		
		
		Myq.add("ramu");
		Myq.add("somu");
		Myq.add("jonu");
		
		System.out.println(Myq);
		System.out.println(Myq.peek());
		System.out.println(Myq);
		System.out.println(Myq.poll());
		System.out.println(Myq);
		
		Iterator<String> iter= Myq.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
