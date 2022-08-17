package ch6;

public class ClassDemoNonSub {
	void met() {
		ClassDemo1 obj = new ClassDemo1();
		
		//System.out.println(obj.pri);//- CLASS SCOPE
		System.out.println(obj.nomod);
		System.out.println(obj.pro);
		System.out.println(obj.pub);
	}

}
