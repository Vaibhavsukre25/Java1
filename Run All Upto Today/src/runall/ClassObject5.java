package runall;

public class ClassObject5 {
	public static void main(String[] args) {
		
		Calculator calci=new Calculator();
		calci.setNumbers(20, 10);
		System.out.println("Addtion..:"+calci.getAddition());
		System.out.println("Subtraction..:"+calci.getSubstraction());
		System.out.println("Multiplication..:"+calci.getMultiplication());
	}
}
class Calculator{
	int n1,n2;
	public void setNumbers(int num1,int num2) {
		n1=num1;
		n2=num2;
	}
	
	public int getAddition() {
		return n1+n2;
	}
	
	public int getSubstraction() {
		return n1-n2;
	}
	
	public int getMultiplication() {
		return n1*n2;
	}

}
