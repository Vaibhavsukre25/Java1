package runall;

public class Lambda1 {
	public Lambda1() {
		System.out.println("constructor logic called on behalf of met method...");
	}
	public static void main(String[] args) {
		//normal
		Temp2 temp=new Temp2Impl();
		temp.met();
		
		//The next approaches can be used for only Functional interfaces
		//anonymous way of implementation
		
		new Temp2() {			
			@Override
			public void met() {
				System.out.println("met anonymous called...");
			}
		}.met();
		
		//Lambda implementation
		temp=()->{System.out.println("met method logic called...-Lambda");};
		temp.met();
		
	//	TempWithParam tempWithParam=(String n,int i)->{System.out.println(n+"..."+i);};
		TempWithParam tempWithParam=(n,i)->{
			System.out.println(n+"..."+i);
			return "success";
		};
		
		String s=tempWithParam.metParam("hello", 100);
		System.out.println(s);
		
		//Method Referencing...
		
		temp=new Lambda1()::myMethod;
		temp.met();
		
		temp=Lambda1::myMet;
		temp.met();
		
		temp=Lambda1::new;
		temp.met();
		
	}
	public void myMethod() {
		System.out.println("my method logic called....called on behalf of met method...");
	}
	public static void myMet() {
		System.out.println("my met static logic called....on behalf of met method...");
	}
}
@FunctionalInterface
interface Temp2{
	public void met();
	//public void met2();
}
@FunctionalInterface
interface TempWithParam{
	public String metParam(String s,int i);
}
class Temp2Impl implements Temp2{
	@Override
	public void met() {
		System.out.println("met called of temp impl...");
	}
}
