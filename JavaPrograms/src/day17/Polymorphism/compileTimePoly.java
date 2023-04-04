package day17.Polymorphism;

public class compileTimePoly {
	static void sum(int a, int b) {
		int c = a + b;
		System.out.println("Addition of two numbers :" + c);
	}
	static void sum(int a, int b, int e) {
		int c = a + b + e;
		System.out.println("Addition of three numbers :" + c);
	}
	public static void main(String[] args) {

		compileTimePoly.sum(45, 80, 22);
	}
}
/**
 * When a method gets to know its implementation at the time of compilation is known as compile
 * time poly this can be achieved by using static method overloading
 * staic members are loaded into the memory at the time of compilation they are also called as class loaders
 * we cant inherit static mem
 * inheri is only for non-static members
 * nonstatic loaded at the time of execution when obj are created
 */

