package day2;

public class Classobject {
	public static void main(String[] args) {
		int i=10;
		
		Walker w;
		Walker vaibhav=new Walker();
		vaibhav.Walking();
		vaibhav.n=101010;
		System.out.println(vaibhav);
		System.out.println(i);
		System.out.println("@26f0a63f");
		
		int ii= vaibhav.hai();
		System.out.println(ii);
		
	}
	
	
}

class Walker{
	int n=100;
	void Walking() {
		System.out.println(n);	
	}
	 int hai() {
		return 10000;
		
}
}
    
    	