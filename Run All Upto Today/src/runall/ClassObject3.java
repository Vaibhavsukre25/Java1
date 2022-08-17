package runall;

public class ClassObject3 {
	public static void main(String[] args) {
		
		Car myCar=new Car();
		System.out.println("Gear..:"+myCar.getGear());
		myCar.changeGear();
		myCar.changeGear();
		myCar.changeGear();
		System.out.println("Gear..:"+myCar.getGear());
	}
}
class Car{
	int gear=0;
	public void changeGear() {
		if(gear==0) {
			gear=1;
		}
		else if(gear==1) {
			gear=2;
		}
		else if(gear==2) {
			gear=3;
		}
		else {
			gear=0;
		}
	}
	public int getGear() {
		return gear;

	}

}
