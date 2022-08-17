package runall;

public class ClassObject9 {

	public static void main(String[] args) {
		
		Temp temp=new Temp();
		temp.setS("hello");
		
		System.out.println(temp.getS());
	}
}
//this - key word
/*
 * when the local variable and instance variable have the same name then
 * always the  local variable will be referred inside the method
 * how do we refer the instance variable s inside a method ?
 * 			We use "this" keyword for refererring instance variable
 *
 * "this" - indicates or refers current object
 */
class Temp{
	String s;
	public void setS(String s) {
		this.s=s;//"this.s" refers to current object s instance variable
	}
	public String getS() {
		return s;//since there is no local variable by name s - u dont need to use "this" keyword
	}
}
