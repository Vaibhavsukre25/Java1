package basic;

public class ConditionDateMonth {
	public static void main(String[] args) {
	
		String date = "17 feb 2022";
		String month = date.substring(3,6);
		System.out.println(month);
		if(month.equals("feb")) {
			System.out.println("This is feburvary month.........");
		}
		else if(month.equals("jan")) {
			System.out.println("This is januvary month.....");
		}
		else if(month.equals("mar")) {
			System.out.println("This is march month........");
		}
		else{
			System.out.println("I will check it and send you back....");
		}
		
	}

}
