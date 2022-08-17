package runall;

public class Forlloop1 {
	public static void main(String[] args) {
		
		//for(initialization;condition;increment or decrement) {
				int arr[]= {10,30,50,23,56};
				
				for(int i=0;i<arr.length;++i) {
					System.out.println(arr[i]);
				}
				
				int [][]twoarr= {
						{23,45,56,67,67},
						{34,56,67,87,89},
						{12,23,34,56,67}
				};
				
				for(int i=0;i<twoarr.length;i++) {
					for(int j=0;j<twoarr[i].length;j++){
						System.out.print(twoarr[i][j]+"\t\t\t");
					}
					System.out.println();
				}
	}

}
