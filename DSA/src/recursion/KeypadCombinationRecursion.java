package recursion;

public class KeypadCombinationRecursion {
	
	public static String Keypad[] = {"." , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz"};
	
	public static void printcombination(String str , int idx , String combination) {
		if(idx == str.length()) {
			System.out.println(combination);
			return;
		}
		
		char currchar = str.charAt(idx);
		String mapping = Keypad[currchar - '0'];
		
		for(int i=0;i<mapping.length();i++) {
			printcombination(str, idx+1, combination+mapping.charAt(i));
		}
	}
	
	
	public static void main(String[] args) {
		String str = "4";
		printcombination(str, 0, "");
	}

}
