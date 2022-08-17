package ch6;

public class ClassDemo {
public static void main(String[] args) {
	
	ClassDemo obj = new ClassDemo();
	
	obj.met();
	
	Car car = new Car();
	car.filterPetrol();
	car.drive(100);
	car.light("AHS", "nhsn", 10);
	 }

   void met() {
	   System.out.println("Met method called...");
   }
}

class Car{
	void filterPetrol() {
		System.out.println("Filter petrol method working....");
	}
	void drive(int Speed) {
		System.out.println("Spped of car .....:"+Speed);
	}
	void light(String frontlight,String backlight,int Power) {
		System.out.println("frontlight name is...."+frontlight);
		System.out.println("backlight name is...."+backlight);
		System.out.println("power  is...."+Power);
	}
	
}