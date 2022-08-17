package basiclang;

public class BasicString {
	public static void main(String[] args) {
		
		
		String s = "HEllo";
		String s1 = "123";
		int num = Integer.parseInt(s1);
		System.out.println(num);
		
		int number = 25;
		String s2 = Integer.toString(number);
		System.out.println(s2.length());
		System.out.println(s.substring(0,2));
		System.out.println(s);
		System.out.println(s.length());
		for(int i=0;i<5;i++) {
			System.out.println(s.charAt(i));
		}
		
		String n1="Vaibhav";
		String n2 = "VAibhav";
		if(n1.equals(n2)) {
			System.out.println("Strings are same hetre............");
		}
		else {
			System.out.println("Strings are not same here..........");
		}
		if(n1==n2) {
			System.out.println("Strings are equal..");
		}
		else {
			System.out.println("Strings are not equal");
		}
		if(new String("Vaibhav")==new String("Vaibhav")) {
			System.out.println("They are same Strings......");
		}
		else {
			System.out.println("They are not same Strings......");
		}
	}

}
