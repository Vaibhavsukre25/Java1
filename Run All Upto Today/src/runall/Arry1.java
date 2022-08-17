package runall;

public class Arry1 {
	public static void main(String[] args) {
		
int arr[]= {10,30,12,40};//one row and 4 columns - single dimensional array
		
		arr[0]=200;
		System.out.println(arr[0]);
		
		System.out.println(arr.length);//in a single dimensional array, length will return number of columns
		
		String fsarr[]= {"apple","bat","cat"};
		System.out.println(fsarr.length);
		String sarr[]=new String[6];
		sarr[0]="apple";
		sarr[1]="bat";
		sarr[2]="cat";
		sarr[3]="dog";
		sarr[4]="elephant";
		sarr[5]="fan";
		System.out.println(sarr.length);
		System.out.println(sarr[4]);
	}

}
