package ch6;

public class ClassDemo1sub extends ClassDemo1{
	void met() {
		//System.out.println(pri);//- CLASS SCOPE
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}

}
//sub class
class Bird{} //-class
class Eagle extends Bird{}//- subclass - inheritance
