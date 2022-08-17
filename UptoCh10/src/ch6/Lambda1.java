package ch6;

public class Lambda1 {
	public static void main(String[] args) {
		
		Sayhello my1 = () -> {System.out.println("met called......");};
		my1.met();
		
		Sayhello1 my2 = (s,i) -> {System.out.println("Met called.....:" + s + ":" + i);};
		my2.met("Java", 524);
		
		Sayhello2 my3 = (name) -> {System.out.println("met called with......"+ name);};
		my3.met("Javaaaaaaaaaaaa");
		
		Sayhello2 my4 = (name) -> { System.out.println("Java called with oops"+name);};
		my4.met("Vaibhav");
		
	}

}

interface Sayhello{
	public void met();
}

interface Sayhello1{
	public void met(String s , int i);
}

interface Sayhello2{
	public void met(String name);
}