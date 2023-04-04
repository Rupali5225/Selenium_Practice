package day12.TotalRecall;

public class totalRecall {
	//Global variables
	static int num1 = 10; //staic globl var(SGV)
	int num2 = 20; // Non-static global var 
	// Blocks 
	//static block
	static {
		System.out.println("program starts - I am static initialization or SIB");
	}
	{
		System.out.println("nonstatic initialization block or instance initialization block");
	}
	
	// constructor overloading
	 totalRecall() {
		 System.out.println("I am zero parameter constructor");
	}
	 totalRecall(int a) {
		 this();  // calling another construcor  // called as constructor chaining
		 System.out.println("cmshd");
	 }
	 //method or function ----> can have static or non-static method
	 
	 void display() {
		 System.out.println("I am non static void method");
	 }
	 static void show() {
		 System.out.println("I am non-static void method ");
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(totalRecall.num1); //acess static var

		totalRecall t1 = new totalRecall();
		System.out.println(t1.num2);// access non-static
		
		totalRecall.show(); // call static method
		t1.display();
		
		
		

	}

}
