package day4.Methodoverloading;
/**
 * Method Overloading: any method declare more than once in class body with
 * anyone of below rules: 
 * 1. type of argument differ or 
 * 2. number of arguments/parameter should differ or 
 * 3. position of arguments/parameter should differ
 */

public class methodOverloading {
	static double res;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square();
		square(2);
		square(5.1);
		square(8.1f);
	}
		static public void square(int num1){
			res = num1*num1;
			System.out.println("res of number is"+res);
	}
		static public void square(double num1) {
			res = num1*num1;
			System.out.println("res of two double num"+res);
	}	
	static public void square() {
		System.out.println("res of two number");
	}
	static public void square(float num1) {
		res = num1*num1;
		System.out.println("res of two float num "+res);
	}
}
