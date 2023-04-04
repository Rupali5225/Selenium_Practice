package day19.ArrayAssignments;

public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
        int i,j, first;
        int n = 2;
        
        for(i=0;i<n;i++) {
        	first=arr[0];
        	for( j=0;j<arr.length-1;j++) {
            	System.out.println("value of j"+j);

        		arr[0]=arr[j+1];
        	}
        	System.out.println("afterrrrr value of j   "+j);

        	arr[j]= first;

        }
        
		for(int k=0;k<arr.length;k++) {
		System.out.println(arr[k]);
	}
		
//		for(i=0;i<arr.length-1;i++) {
//            arr[i] = arr[i+1];  
//
//			
//		}
//		
//        arr[i] = first;  
//
//		for(int j=0;j<arr.length;j++) {
//			System.out.println(arr[j]);
//		}
//	}
	

}
}
