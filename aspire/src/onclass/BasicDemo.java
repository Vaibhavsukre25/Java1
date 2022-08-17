package onclass;

public class BasicDemo {
	
   Lathershoe hi =  new Lathershoe();
   
   //shoe.met2();
   
}

abstract class shoe {//it is genralized class
	int amt = 1000;
	public shoe() {
		System.out.println("cons of shoe called......");
	}
	public shoe(int i) {
		System.out.println("overloaded called......");
	}
	public void met() {
		System.out.println("met..........");
	}
	public int met2() {
		return 100;
	}
}

class Lathershoe extends shoe{ // it is specilizied class
	
}
class sportshoe extends shoe{
	
}