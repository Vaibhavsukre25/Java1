package classesAndobjects;

public class Constructorcalled {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.age = 25;
	    s1.name = "vaibhav";
	    
	    Student s2 = new Student(s1);
		s1.Info();
		
		
	}
	
}







class Student{
	String name;
	int age;
	public void Info() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	public Student(Student s2) {
		System.out.println("cons called.......");
		this.age = s2.age;
		this.name = s2.name;
		
	}
	public Student() {
		
	}
}