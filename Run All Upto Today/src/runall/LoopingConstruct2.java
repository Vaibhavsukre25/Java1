package runall;

public class LoopingConstruct2 {
public static void main(String[] args) {
	
	int i=55;
	
	while(i<100) {
		System.out.print(i+"\n");
		i++;
	}
	//System.out.println("H \f    e   \r   l\blo   \''   W  \no  \t  rl \\d   ");
	
	while(i<10) {
		System.out.println("while loop executed.");
	}
	do {
		System.out.println("do while executed....");
	}while(i<10);
}
}
