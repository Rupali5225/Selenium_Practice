package day13.Inheritance;

class A {
	static int a1 = 10;
	int b = 20;
}

class B extends A {
	static int b1 = 20;
	int b = 30;
}

class C extends B {
	static int c1 = 30;
	int b = 20;
}

public class SGVnNSGOfParent {

	public static void main(String[] args) {
		//To access non static member of class A,B,C with inheritance we only need to create object of class C 
		C objc = new C();
		System.out.println("With Class C refer: "+objc.a1);
		System.out.println("With Class C refer: "+objc.b1);
		System.out.println("With Class C refer: "+objc.c1);

		// To access static : classname.varname 
		System.out.println("With Class C refer: "+A.a1);
	}

}
