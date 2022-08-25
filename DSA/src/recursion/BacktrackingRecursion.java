package recursion;

public class BacktrackingRecursion {
	
	public static void PrintPerm(String str , String perm , int index) {
		
		if(str.length()==0) {
			System.out.println(perm);
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			char currchar = str.charAt(i);
			String newStr = str.substring(0, i) + str.substring(i+1);
			PrintPerm(newStr, perm + currchar, index+1);
		}
		
	}
	
  public static void main(String[] args) {
             String str = "ABC";
             PrintPerm(str, "", 0);
  }
}
