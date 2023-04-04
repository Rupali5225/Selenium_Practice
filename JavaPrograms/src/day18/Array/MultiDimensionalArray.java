package day18.Array;

public class MultiDimensionalArray {
public static void main(String[] args) {
	// declaring and initializing 2D array
	int[][] arr = new int[3][3];
	System.out.println("array size"+arr.length);//row count
	//printing array ele with for loop
	for(int i=0;i< arr.length;i++) {  // this will return lenght of only row to get col ele need to use i values
		for(int j=0;j<arr[i].length;j++) {
			System.out.println(arr[i][j]);
		}
		
	}
	System.out.println("*****************************");
	arr[0][0] = 1;
	arr[0][1] = 2;
	arr[0][2] = 3;
	arr[1][0] = 4;
	arr[1][1] = 5;
	arr[1][2] = 6;
	arr[2][0] = 7;
	arr[2][1] = 8;
	arr[2][2] = 9;
	// printing 2D array
	for (int i = 0; i < arr.length; i++) {// to get row num
		for (int j = 0; j < arr[i].length; j++) {// to get column for above row
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
	
}
}
