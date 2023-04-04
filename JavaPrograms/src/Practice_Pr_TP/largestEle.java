package Practice_Pr_TP;

public class largestEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,6,4,5};
		int largest = 0;
		for(int i = 0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i] > arr[j]) {
					largest = arr[i];
				}
			}
		}
		System.out.println(+largest);
	}

}
