package basiclang;

public class ForLoop {

	public static void main(String[] args) {
		 for(int i=0;i<=10;i++) {
			 System.out.println(i+" ");
			 break;
		 }
		 
		 int i=0;
		 while(i<=10) {
			 System.out.println(i);
			 i++;
			 break;
		 }
		 
		 i=0;
		 do {
			 System.out.print(i);
			 ++i;
		 }while(i<10);
	}
}
