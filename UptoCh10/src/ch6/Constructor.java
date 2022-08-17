package ch6;

public class Constructor {
	String s="Vaibhav Called";
	Constructor() {
		this.s=s;
		System.out.println("Constructor called.....");
	}
	
	Constructor(String s){
		
		System.out.println("Cons called with..."+ s);
	}
	Constructor(String s, int i){
		System.out.println("cons called with ......" + s +"................."+ i);
	}
	
	
	public static void main(String[] args) {
		
		Constructor obj = new Constructor();
		System.out.println(".................");
		Constructor obj2 = new Constructor("Hello");
		Constructor obj3 = new Constructor("Hey..." , 10000);
	
	}
	

}
