package stack;

import java.util.*;


public class StackByArrayListO {
	
	 static class Read{
		static ArrayList<Integer> list = new ArrayList<>();
		public static boolean isEmpty() {
			return list.size() == 0;
		}
		
		public static void push(int data) {
			list.add(data);
		}
		public static int pop() {
			int top = list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return list.get(list.size()-1);
		}
	}

	
	public static void main(String[] args) {
		
		Read s = new Read();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
	   }

	}}
