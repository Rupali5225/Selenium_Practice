package Practice_Pr_TP;

public class rightrotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int last = 0;
		last = arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i] = arr[i-1]; 
		}
		arr[0] = last;
        //Displays resulting array after rotation    
        System.out.println("Array after right rotation: ");    
        for(int i = 0; i< arr.length; i++){    
            System.out.print(arr[i] + " ");  
		}	}
	

}
