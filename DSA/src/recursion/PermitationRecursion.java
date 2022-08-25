package recursion;

public class PermitationRecursion {
     
	
	public static void PrintPermi(String str , String Permitation) {
		
		if(str.length()==0) {
			System.out.println(Permitation);
			return;
		}
		for(int i=0; i<str.length();i++) {
			char currchar = str.charAt(i);
			
			String newstr = str.substring(0, i)+ str.substring(i+1);
			
			PrintPermi(newstr, Permitation+currchar);
		}
		
	}
	
	public static void main(String[] args) {
		
		String str = "abc";
	   PrintPermi(str, "");

	}
}
