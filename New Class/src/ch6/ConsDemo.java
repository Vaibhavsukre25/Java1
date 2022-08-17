package ch6;

public class ConsDemo {
	ConsDemo(){//constructor
		System.out.println("Cons called.....");
	}
	ConsDemo(String s){
		System.out.println("Cons called......"+s);
	}
	ConsDemo(String s,int i){
		System.out.println("Cons called....."+s+"....."+i);
	}
 
	 public static void main(String[] args) {
		//new ConsDemo();
		// ConsDemo obj = new ConsDemo();
		 System.out.println("_______________");
		// ConsDemo obj2 = new ConsDemo("Hello");
		// ConsDemo obj3 = new ConsDemo("Hello",10000);
		 new ConsDemo();
		 new ConsDemo("Hello");
		 new ConsDemo("Hello",25112);
		 
		 
	}
}
