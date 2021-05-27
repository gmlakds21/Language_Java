package seunghee;

public class _10_Array {
	public static void main(String[] args) {
		
		/* Array1 */ {
			int[] arr1 = new int[] {101, 102, 103};
			for ( int arr : arr1) {
				System.out.println(arr);
			}
			
			int[] arr2 = new int[3];
			for (int arr : arr2) {
				System.out.println(arr);
			}
			
			int[] arr3 = {101, 102, 103};
			for (int arr : arr3) {
				System.out.println(arr);
			}
		}
		/* Array2 */ {
			System.out.println("\narr1");
			int[][] arr1 = new int[][] {{},{}};
			for (int i=0; i<arr1.length; i++) {
				for (int j=0; j<arr1[0].length; j++) {
					System.out.println(arr1[i][j]);
				}
			}
		
			System.out.println("\narr2");
			int[][] arr2 = new int[][] {{1, 3}, {1, 3, 5}};
			for (int i=0; i<arr2.length; i++) {
				for (int j=0; j<arr2[i].length; j++) {
					System.out.println(arr2[i][j]);
				}
			}
			
			System.out.println("\narr3");
			int[][] arr3 = new int[2][3]; 
			for (int i=0; i<arr3.length; i++) {
				for (int j=0; j<arr3[i].length; j++) {
					System.out.println(arr3[i][j]);
				}
			}
					
			System.out.println("\narr4");
			int[][] arr4 = {{1, 3}, {1, 3, 5}};
			for (int i=0; i<arr4.length; i++) {
				for (int j=0; j<arr4[i].length; j++) {
					System.out.println(arr4[i][j]);
				}
			}
		}
		
		
	}
}
