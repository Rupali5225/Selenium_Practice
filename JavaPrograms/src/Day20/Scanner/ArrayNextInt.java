package Day20.Scanner;
import java.util.Scanner;

public class ArrayNextInt {
public static void main(String[] args) {
	int[] arr = new int[5];
	Scanner s1 = new Scanner(System.in);
	for(int i=0;i<5;i++) {
		System.out.println("enter array element"+i);
		arr[i]= s1.nextInt();
	}
	for(int i=0;i<5;i++) {
	System.out.println("array" +arr[i]);
	}
}

}
