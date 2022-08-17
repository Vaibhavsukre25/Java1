package runall;

public class SingleTon1 {
public static void main(String[] args) {
	
	MySingleTon obj=MySingleTon.createObject();
	MySingleTon.createObject();
	MySingleTon.createObject();
	MySingleTon.createObject();
}
}
class MySingleTon{
private MySingleTon() {
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
