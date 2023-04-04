package Practice_Pr_TP;

public class rotateRi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lastEle;
		int[] arr = {1,2,3,4,5};
		lastEle = arr[arr.length-1];
		
		for(int i = arr.length-1;i>0;i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = lastEle;
		
		for(int j = 0;j<arr.length;j++){
			System.out.println(arr[j]);
		}
		
	}

}
