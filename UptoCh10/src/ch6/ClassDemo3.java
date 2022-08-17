package ch6;

public class ClassDemo3 {
	public static void main(String[] args) {
		ClassDemo3 obj = new ClassDemo3();
		obj.met();
	    Car car = new Car();
	    car.filterpetrol();
	    car.speed(250);
	    car.trafficlight("blue", "Red");
		
	}

	void met(){
		System.out.println("Met method called........");
	}
}
class Car{
	void filterpetrol() {
		System.out.println("Petrol filtered .........");
	}
	void speed(int speed) {
		System.out.println("Speed of a car......."+speed);
	}
	void trafficlight(String s,String j) {
		System.out.println("name of traffic light......."+s+j);
	}
}