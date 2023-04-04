package Practice_Pr_TP;

public class duplicateEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5,1,4};
		int i,j;
		for(i=0;i<arr1.length;i++) {
			for(j=i+1;j<arr1.length;j++) {
			if(arr1[i]==arr1[j]) {
				System.out.println(arr1[i]);
			}
			}
		}
	}

}
