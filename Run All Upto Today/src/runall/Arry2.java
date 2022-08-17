package runall;

public class Arry2 {
	public static void main(String[] args) {
		
int i[][]=new int[3][4];//declaring an array with 3 rows 4 columns.
		
		//Remember - By default all arrays will have a default value...for INT it is ZERO
		i[0][3]=2020;//0-3 refers to first row 4th column
		i[0][1]=2021;
		System.out.println(i[0][3]);
		
		System.out.println("No Of Rows..:"+i.length);//the count of rows in the array
		
		System.out.println("No of Columns of first row..:"+i[0].length);//this will return count of columns of the FIRST row.
		
		int n=0;
		int x=0;
		while(n<i.length) {//this loop will run for 3 times
			while(x<i[n].length) {
				System.out.print(i[n][x]+"\t");
				x++;
			}
			System.out.println();
			x=0;
			n++;
		}
	}

}
