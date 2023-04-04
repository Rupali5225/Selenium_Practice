package day19.ArrayAssignments;

public class SmallestEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,1,4};
		int smallest = arr[0];
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>arr[i+1]) {
			smallest=arr[i];
		
	}
		System.out.println("sssssssssssssss"+smallest);

		}
		//System.out.println("smallest"+smallest);

	}

}
