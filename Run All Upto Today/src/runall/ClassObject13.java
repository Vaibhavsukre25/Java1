package runall;
//In this exercise
//1. you will understand instance variable and class variable
//2. golden tips of static keyword
public class ClassObject13 {
	//what ever variable u give outside a method is called instance variable
	//what ever variable u give with the keyword static is called class variable
	public static void main(String[] args) {
		//local variable - what ever variable u give inside a method is called local variable
		TrainingRoom1 gandhi=new TrainingRoom1();
		TrainingRoom1 nehru=new TrainingRoom1();
		
		System.out.println(gandhi.sanyo);
		System.out.println(nehru.sanyo);
		
		System.out.println(TrainingRoom1.sulab);
		System.out.println(TrainingRoom1.sulab);
	}
}
//Local variable
//instance variable - For every instance of the class, a object is created...
//class variable - For the class one instance of class variable is created and it will be
//shared by all the objects created using that class.
class TrainingRoom1{
	Projector sanyo=new Projector();//instance variable
	static Toilet sulab=new Toilet();//class variable
}
/*
* Golden Rules
* static - static keyword does the following
* 1. static keyword creates class variables.
* 2. static keyword creates class methods
* 3. The memory allocation of static variables, static methods and static classes are done by JVM
* 4. You can access the static variables and static methods using the class name itself
* Ex: TrainingRoom.sulab;
* 5. static methods cannot access non static variables or methods
*/
class Projector{
	
}
class Toilet{
	
}



