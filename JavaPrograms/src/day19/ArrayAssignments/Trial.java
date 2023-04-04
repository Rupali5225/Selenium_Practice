package day19.ArrayAssignments;

public class Trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2,3,4,1,1,1};
		//int[] arr2 = new int[arr1.length];
		int i,count=0;
		for(i=0;i<=arr1.length-1;i++) {
			count = 0 ;
			for(int j=i;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					count++;
				}
			}
			System.out.println("repeatation of" +count);

		}

	}

}
