package runall;

public class Forloop2 {
public static void main(String[] args) {
	
	//for(initialization;condition;increment or decrement) {
			int arr[]= {10,30,50,23,56};
			
//			for(int i=0;i<arr.length;++i) {
//				System.out.println(arr[i]);
//			}
			
			//Enhanced For loop // - introduced in jdk 5
			//enhanced for loop works only on arrays
			
			for(int i:arr) {
				System.out.println(i+"\n");
			}
			
			int [][]twoarr= {
					{23,45,56,67,67},
					{34,56,67,87,89},
					{12,23,34,56,67}
			};
			
//			for(int i=0;i<twoarr.length;i++) {
//				for(int j=0;j<twoarr[i].length;j++){
//					System.out.print(twoarr[i][j]+"\t");
//				}
//				System.out.println();
//			}
			
			for(int i[]:twoarr) {
				for(int j:i) {
					System.out.print(j+"\t");
				}
				System.out.println();
				System.out.println(i+"\t");
			}
}
}
