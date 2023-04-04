package day19.ArrayAssignments;

public class RotateRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };

		int k, n;
		n = 3;
        //Displays original array    
        System.out.println("Original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");     
        }   
        
		for (int i = 0; i < n; i++) {
			int j, last;

			last = arr[arr.length-1];

			for (j = arr.length-1; j > 0; j--) {
				// Shift element of array by one
				arr[j] = arr[j - 1];
			}
			arr[0] = last;
		}
        //Displays resulting array after rotation    
        System.out.println("Array after right rotation: ");    
        for(int i = 0; i< arr.length; i++){    
            System.out.print(arr[i] + " ");  
		}
	}

}
