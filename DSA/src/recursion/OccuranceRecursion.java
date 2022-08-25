package recursion;

public class OccuranceRecursion {
	
	public static int first = -1;
	public static int last = -1;
	
	public static void FindOccurance(String str , int index , char element) {
		
		if(index == str.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char currchar = str.charAt(index);
		if(currchar == element) {
			if(first == -1) {
				first = index;
			}else {
				last = index;
			}
		}
		
		FindOccurance(str, index+1, element);
	}
	
	
	
	public static void main(String[] args) {
		
		String str = "abaacdaefaah";
		FindOccurance(str, 0, 'a');
	}

}
