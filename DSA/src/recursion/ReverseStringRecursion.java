package recursion;

public class ReverseStringRecursion {
	
	public static void ReverseString(String s , int index) {
      if(index == 0) {
    	  System.out.println(s.charAt(index));
    	  return;
      }
		System.out.print(s.charAt(index) + "\t");
		ReverseString(s, index-1);
		
	}
	
	public static void main(String[] args) {
		
		String s = "abcd";
		ReverseString(s, s.length()-1);
	}

}
