package Practice_Pr_TP;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 1, 2, 3, 4, 1, 2 };
		int[] arr2 = new int[arr1.length];
		for (int i = arr1.length-1; i >= 0; i--) {
			arr2[i] = arr1[i];
			System.out.println(arr2[i]);
		}
	}

}
