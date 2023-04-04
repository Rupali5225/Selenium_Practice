package day10.VariablesType;

public class StaticGlobalLocalCalling {

	static int age = 25; // Static global declare n initialize
	int percentage = 76; // Non-Static global declare n initialize

	public static void main(String[] args) {
		int age = 30; // local declare n initialize

		/* Calling of local,SG,NSG */

		System.out.println("I am local age: " + age); // local calling
		/* Static global calling with classname.var name */
		System.out.println("I am global age: " + StaticGlobalLocalCalling.age);
		/* Non-Static global calling with instance/obj */
		StaticGlobalLocalCalling s1 = new StaticGlobalLocalCalling();
		System.out.println("I am global age: " + s1.age);

	}
}
