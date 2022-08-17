package runall;


//print ascii values
public class Lab5 {
	public static void main(String[] args) {
		int i=169;
		char c=(char)i;
		
		System.out.println("character of ascii number 169 is...:"+c);
		
		for(int n=0;n<=250;n++) {
			System.out.println("The character value of ascii number.."+n+" is..:"+(char)n);
		}
	}
}
