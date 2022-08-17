package runall;

public class Operators3 {
	public static void main(String[] args) {
		
		int i=10;
		int j=20;
		
		//Relational operators
		
		System.out.println(i==j);//it if and j are equal then it will print true
		System.out.println(i!=j);//if i is not equal to j, it will print true
		System.out.println(i<j);//if i is lesser than j then it prints true
		System.out.println(i>j);//if i is greater than j then it prints true
		System.out.println(i>=j);//if i is greater than or equal to j then it prints true
		System.out.println(i<=j);//if i is lesser than or equal to j then it prints true
		
		//Logical Operators
		
		// && || !
		int x=20;
		int y=10;
		System.out.println(i==j && x>y);//this statement will print true, only if both the expressions return true
		System.out.println(i==j || x>y);//this statement will print true, even if any one of the expression return true
	}

}
