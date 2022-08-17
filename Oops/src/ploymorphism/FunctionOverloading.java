package ploymorphism;

import java.util.Scanner;

public class FunctionOverloading {
	public static void main(String[] args) {
		Student s1 = new Student();
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		String name = scan.next();
		s1.age = age;
		s1.name = name;
		s1.PrintInfo(age);
		s1.PrintInfo(name);
		s1.PrintInfo(name, age);
		
	}

}
class Student{
	String name;
	int age;
	public void PrintInfo(String name) {
		System.out.println(name);
	}
	public void PrintInfo(int age) {
		System.out.println(age);
	}
	public void PrintInfo(String name ,int age) {
		System.out.println(name + " "+ age);
	}
}
