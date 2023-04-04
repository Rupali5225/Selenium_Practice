package Practice_Pr_TP;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,8,5,3,4,5};
		int temp = 0;
		int[] arr2 = new int[arr.length];
		for(int i = 0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
				
			}
		}
		for(int j = 0;j<arr.length;j++){
			System.out.println(arr[j]);
		}
	}

}
