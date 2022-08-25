package recursion;

import java.util.HashSet;

public class SubsequencesRecursion {
	
	public static void subsequences(String str , int idx , String newString , HashSet<String> set) {
		
		if(idx == str.length()) {
			if(set.contains(newString)) {
				return;
			}else {
				System.out.println(newString);
				set.add(newString);
				return;
			}
		}
		char currchar = str.charAt(idx);
		
		subsequences(str, idx+1, newString+currchar , set);
		
		subsequences(str, idx+1, newString , set);
	}
	
	
	public static void main(String[] args) {
		
		String str = "aaa";
		
		HashSet<String> set = new HashSet<String>();
		
		subsequences(str, 0, "" , set);
	}

}



/*package recursion;

public class SubsequencesRecursion {
	
	public static void subsequences(String str , int idx , String newString) {
		
		if(idx == str.length()) {
			System.out.println(newString);
			return;
		}
		char currchar = str.charAt(idx);
		
		subsequences(str, idx+1, newString+currchar);
		
		subsequences(str, idx+1, newString);
	}
	
	
	public static void main(String[] args) {
		
		String str = "abc";
		
		subsequences(str, 0, "");
	}

}
*/