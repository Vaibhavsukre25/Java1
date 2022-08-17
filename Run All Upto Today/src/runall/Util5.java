package runall;

import java.util.Iterator;
import java.util.Stack;

public class Util5 {
	public static void main(String[] args) {
		
Stack<String> stack=new Stack<>();
		
		stack.add("ramu");
		stack.add("somu");
		stack.add("jonu");
		stack.add("arvind");
		stack.add("bala");
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack);
		
		Iterator<String> iter=stack.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
