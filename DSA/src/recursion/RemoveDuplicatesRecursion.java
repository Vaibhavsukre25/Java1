package recursion;

public class RemoveDuplicatesRecursion {
	
	public static boolean map[] = new boolean[26];
	
	public static void RemoveAllDeplicates(String str , int idx , String newString) {
		
		if(idx == str.length()) {
			System.out.println(newString);
			return;
		}
		
		char currchar = str.charAt(idx);
		if(map[currchar - 'a']) {
			RemoveAllDeplicates(str, idx+1, newString);
		}
		else {
			newString += currchar;
			map[currchar - 'a'] = true;
			RemoveAllDeplicates(str, idx+1, newString);
		}
		
	}
	
	public static void main(String[] args) {
		
		String str = "abbccddaad";
		
		RemoveAllDeplicates(str, 0, "");
	}

}
