package ch6;

public class AnnotationDemo {
	public static void main(String[] args) {
		TiffenBox<NonVegFood> box = NonVegCanteenContainer.getBox();
		NonVegFood food = box.getItem();
		System.out.println(food);
		
		TiffenBox<VegFood> box2 = VegCanteenContainer.getBox();
		VegFood food2 = box2.getItem();
		System.out.println(food2);
		
		TiffenBox<Currency> box3 = HawalaContainer.getBox();
		Currency currency = box3.getItem();
		System.out.println(currency);
		
	}

}

class NonVegCanteenContainer{
	public static TiffenBox<NonVegFood> getBox(){
		TiffenBox<NonVegFood> box = new TiffenBox<>();
		box.setItem(new NonVegFood());
		return box;
	}
}

class VegCanteenContainer{
	public static TiffenBox<VegFood> getBox(){
		TiffenBox<VegFood> box = new TiffenBox<>();
		box.setItem(new VegFood());
		return box;
	}
}

class HawalaContainer{
	public static TiffenBox<Currency> getBox(){
		TiffenBox<Currency> box = new TiffenBox<>();
		box.setItem(new Currency());
		return box;
	}
}

class TiffenBox<T>{
	T item;
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item=item;
	}
}

class food{}
class NonVegFood extends food{}
class VegFood extends food{}
class Currency{}