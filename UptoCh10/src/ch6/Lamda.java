package ch6;

public class Lamda {
	public static void main(String[] args) {
		
		new Lamda().new MyInter25().met();
		
		new MyInter() {
			
			@Override
			public void met() {
				System.out.println("Met method called....");
				
			}
		}.met();
		
		MyInter my = ()->{System.out.println("Met called via lamda");};
		my.met();
		
		MyInter2 my2 = (s,i)->{System.out.println("Met called vai lamda...."+ s +":"+ i);};
		my2.met("Java", 1110);
		
	}
	
	class MyInter25 implements MyInter{
		@Override
		public void met() {
			System.out.println("Met called via nested .......");
		}
	}

}
 
interface MyInter{
	public void met();
}

interface MyInter2{
	public void met(String s , int i);
}