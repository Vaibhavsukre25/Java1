package windowr;

public class Condition2 {
	public static void main(String[] args) {
		
		String date = "07 may 2022";
		String month = date.substring(3,6);
		System.out.println(month);
		
		if(month.equals("feb")) {
			System.out.println("February month......");
		}
		else if(month.equals("jan")){
			System.out.println("Januvary Month.....");
			
		}
		else if(month.equals("mar")) {
			System.out.println("march month......");
		}
		else {
			System.out.println("Rest i amyet to check....");
		}
	}

}
