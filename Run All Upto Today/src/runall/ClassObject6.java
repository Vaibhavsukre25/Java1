package runall;

public class ClassObject6 {

	public static void main(String[] args) {
		
		ClassRoom gandhi=new ClassRoom();
		gandhi.acceptStudents(new String[] {"ram","rahim","john"});
		
		String names[]=new String[] {"ram..","rahim..","john.."};
		gandhi.acceptStudents(names);
		
		String []names2=new String[5];
		names2[0]="ram....";
		names2[1]="rahim....";
		names2[2]="john....";
		gandhi.acceptStudents(names2);		
	}
}
class ClassRoom{
	public void acceptStudents(String names[]) {
		System.out.println("\n**********************************************\n");
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+"\t");
		}
		System.out.println("\n..................................\n");
		for(String s:names) {
			System.out.print(s+"\t");
		}
		System.out.println("\n********************************\n");

	}
}
