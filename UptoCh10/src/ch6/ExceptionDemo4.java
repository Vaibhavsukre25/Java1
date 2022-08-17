package ch6;


public class ExceptionDemo4 {
	public static void main(String[] args) {
		Dog tiger = new Dog();
		try {
		    tiger.play("stone");
		}catch(DogBiteException dd) {
			System.out.println(dd);
		}catch(DogBarkException de) {
			System.out.println(de);
		}
	}

}

class Dog{
	public void play(String item) throws DogBiteException, DogBarkException {
		if(item.equals("Stick")) {
			throw new DogBiteException("You bet i bite......");
			
		}
		if(item.equals("stone")) {
			throw new DogBarkException("you throw i bow.......bow....");
			
		}
	}
}

class DogBiteException extends Exception{
	String msg;
	public DogBiteException(String msg) {
		this.msg = msg;
	}
		@Override
	    public String toString() {
	    	return "Exception is:" +msg;
	    }
	
}
class DogBarkException extends Exception{
	String msg;
	public DogBarkException(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Exception is:" +msg;
	}
}