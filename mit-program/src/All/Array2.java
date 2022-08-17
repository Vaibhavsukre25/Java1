package All;

public class Array2 {
	public static void main(String[] args) {
		
		int arr[][]= {
				{1,2,3,4,5},{6,7,8,9,0},{12,23,34,45}
		};
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		
		int mac[][]= new int[3][4];
		System.out.println(mac[0].length);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" "+mac[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
