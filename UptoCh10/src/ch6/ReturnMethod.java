package ch6;

public class ReturnMethod {
	public static void main(String[] args) {
		ReturnMethod obj = new ReturnMethod();
		System.out.println(obj.call());
		System.out.println(obj.call(100));
		System.out.println(obj.boo());
		System.out.println(obj.GetName(46));
		
	}
	
	int call() {
		return 100;
	}
	
	short call(int i) {
		if(i==10) {
			return 100;
		}
		else {
			return 200;
		}
	}
	
	boolean boo() {
		return true;
	}
	
	String GetName(int rollnum) {
		switch(rollnum) {
		case 44:{
			return "Gajanan";
		}
		case 45:{
			return "Vaibhav";
		}
		default :{
			return "I will check name";
		}
	}

 }
}
