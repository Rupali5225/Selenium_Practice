package Day20.Scanner;
import java.util.Scanner;

public class scannerClass {

	public static void main(String[] args) {

//		int age=10;
//		double salary=2566.36;
//		String name="Pune";

		// Object creation of Scanner class
		Scanner scnRef = new Scanner(System.in);
		int age;
		double salary;
		String name;
		boolean valid;
		int num1, num2;
//		/* Initialization of variable using Scanner class */
//		System.out.println("Enter age value from console");
//		age = scnRef.nextInt();		
//		System.out.println("enter salary");
//		salary = scnRef.nextDouble();
//		System.out.println("Enter name");
//		name = scnRef.next();
//		System.out.println("enter true or false");
//		valid = scnRef.nextBoolean();
		
		/**/
		System.out.println("enter num1");
		num1 = scnRef.nextInt();
		System.out.println("enter num2");
		num2 = scnRef.nextInt();
		
		char op;
		System.out.println("Enter operator: ");
		op = scnRef.next().charAt(0);
		System.out.println("Addition of two numbers: " + addNumber(op, num1, num2));

	}
	static int addNumber(char op, int num1, int num2) {
		if (op == '+') {
			return num1 + num2;
		} else {
			return 0;
		}
	}
}
