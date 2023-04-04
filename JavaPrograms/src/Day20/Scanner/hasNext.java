package Day20.Scanner;
import java.io.InputStream;
import java.util.Scanner;

public class hasNext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello, This is BasicJava.";
		// Create scanner Object and pass string in it
		/**
		 * As Scanner class inherits Iterator interface, which as following methods
		 * 1. hasNext()---> check weather it has data or not and return true if it has
		 * 2. next()------> it returns the data present in Scanner object 
		 * 3. remove()----> to remove data
		 */
		Scanner scan = new Scanner(s);
		// Check if the scanner has a token
		System.out.println("Boolean Result: " + scan.hasNext());
		// Print the string
		System.out.println("String: " + scan.nextLine());
		System.out.println("**********enter ur details*************");
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter name");
		String name;
		name = s1.next();
		System.out.println("enter age");
		int age;
		age = s1.nextInt();
		System.out.println("nameis:" +name +"\n age is:"+age);
	}

}
