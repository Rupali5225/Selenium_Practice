package day19.ArrayAssignments;

public class LargestEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int largest = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(largest<arr[i]) {
				largest = arr[i];
			}
		}
		System.out.println("largest"+largest);

	}

}
