package runall;

public class BreakAndContionue1 {
	public static void main(String[] args) {
		
		int i=0;
		while(i<10) {
			if(i==5) {
				break;
			}
			System.out.println(i);
			i++;
		}
		int x=2;
		india:{
			System.out.println("start of \"a\" block..");
			nepal:{
				System.out.println("start of \"b\" block..");
				srilanka:{
					System.out.println("inside \"c\" block");
					if(x==5) {
						break india;
					}
					else if(x==10) {
						break nepal;
					}
					else if(x==20) {
						break srilanka;
					}
				}
				System.out.println("out of srilanka");
			}
			System.out.println("out of nepal");
		}
		System.out.println("out of india");
	}

}
