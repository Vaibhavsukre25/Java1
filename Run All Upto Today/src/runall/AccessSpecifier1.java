package runall;

public class AccessSpecifier1 {
	
		
			private int pri;
			int nomod;
			protected int pro;
			public int pub;
			
			public void met() {
				System.out.println(pri);
				System.out.println(nomod);
				System.out.println(pro);
				System.out.println(pub);
			}
		}
		class SamePackSubClass extends AccessSpecifier1{
			public void met() {
			//	System.out.println(pri);//private is class scope
				System.out.println(nomod);
				System.out.println(pro);
				System.out.println(pub);
			}
		}
		class SamePackNonSubClass{
			public void met() {
				AccessSpecifier1 obj=new AccessSpecifier1();
				//System.out.println(obj.pri);//private is class scope
				System.out.println(obj.nomod);//package scope
				System.out.println(obj.pro);//relation scope
				System.out.println(obj.pub);//global scope
			}
	}

