package day8.Constructor;

/*constructor is used to intialize the object
 * every time to initialiaze we need to create different obj of same class 
 * if constructor is not written by coder then that will be written by java compiler at compile time
 * Constructor Overloading: more than on constructor in a class 
 * Rule: 1. type of args differ or 
 * 		 2. number of args differ or 
 * 		 3. position of args differ
 * 
 */

public class constructorDemo1 {

	constructorDemo1() {
		System.out.println("zero constructor");
	}

	constructorDemo1(int a) {
		System.out.println("int parameterized constr");
	}

	constructorDemo1(double a) {
		System.out.println("double constr");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorDemo1 c1 = new constructorDemo1();
		constructorDemo1 c2 = new constructorDemo1(1);
		constructorDemo1 c3 = new constructorDemo1(1.1);

	}

}
