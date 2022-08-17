package bulid;

public class SingleTon {
	public static void main(String[] args) {
		MySingleTon obj=MySingleTon.createObject();
		MySingleTon.createObject();
		MySingleTon.createObject();
		MySingleTon.createObject();
		//MySingleTon = new SingleTon();
		
		
	}

}

class MySingleTon{
	private MySingleTon() {
		System.out.println("cons called..");
		System.out.println("cons444s called..");
		System.out.println("cons called..");
	}
	private static MySingleTon obj;
	public static MySingleTon createObject() {//factory method
		if(obj==null) {
			obj=new MySingleTon();
		}
		return obj;
	}
}