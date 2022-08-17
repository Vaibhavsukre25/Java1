package runall;

public class Exception6 {
	public static void main(String[] args) {
		
		try {
			//met("hello");
			met("dog");
		}catch(Exception e) {
			System.out.println(e);
		}		
	}
	
	public static void met(String value)throws Exception {
		if(value.equals("dog")) {
			throw new Exception();
		}
	}

}
