package runall;

/*
 * Where ever you find if-else-if conditions, in a dynamic piece of code, then immediately
 * do the following steps to make the code object oriented.
 * 1. Delete the conditional blocks, throw the code in dustbin
 * 2. Convert the condition to classes
 * 3. Group all the classes under a common classifier class and declare it as abstract
 * 4. Create a association between the classifer class and the using class
 */

public class ClassObject18 {
	public static void main(String[] args) {
		
		PaintBrushs brush=new PaintBrushs();
		brush.paint=new GreenPaint();
		brush.doPaint();		
	}
}
//now my code is close for modification but open for extension
class PaintBrushs{
	Paint paint;
	public void doPaint() {
		System.out.println(paint);
	}		
}
abstract class Paint{
	
}
class RedPaint extends Paint{//redpaint is a kind of paint
	
}
class BluePaint extends Paint{//bluepaint is a kind of paint
	
}
class GreenPaint extends Paint{//greenpaint is a kind of paint
	

}
