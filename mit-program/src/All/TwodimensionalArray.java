package All;

public class TwodimensionalArray {
	public static void main(String[] args) {
		
		int twod[][]= {
				{21,5,6,25,15},{65,25,89,78,68},{14,16,35,62,25}
		};
		
		System.out.println(twod.length); // in two dimensional array when we right length it shows no. of rows in that function
		System.out.println(twod[0][0]);
		System.out.println(twod[0][4]);
		System.out.println(twod[1][3]);
		System.out.println(twod[2][3]);
		
		
		twod[0][0]=500;
		twod[1][1]=500;
		System.out.println(twod[0][0]);
		int sum=twod[0][0]*twod[1][1];
		System.out.println(sum);
		
		int twod2[][]=new int[3][5];
		System.out.println(twod2[0][0]);
		
	}

}
