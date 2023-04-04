package Practice_Pr_TP;

public class leftrotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5};
		int i,left,j;
		
		for(i=0;i<2;i++) {
			System.out.println("ghghghj");
			left = arr1[0];
			for(j=0;j<arr1.length-1;j++) {
				arr1[j]=arr1[j+1];
			}
			arr1[arr1.length-1] = left;
					
			
			
		}
		

		for(i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}	
		
	}

}
