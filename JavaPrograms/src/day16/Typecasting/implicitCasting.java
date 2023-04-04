package day16.Typecasting;

class GrandParent{
	 void myHome() {
		 System.out.println("Home belongs to GrandParent");
	 }
}
class Parent extends GrandParent{
	// Function
	void show() {
		// Print message for this class
		System.out.println("Parent show method is called");
	}
	void callme() {
		System.out.println("Parent callme method is called");
	}
}
class Child extends Parent {
	void readme() {
		System.out.println("Child readme method is called");
	}
}
public class implicitCasting {
	public static void main(String args[])
	{
		//Object of Child class and reference of child class
		Child c1=new Child();
		// Creating a Parent class object but referencing it to a Child class
		Parent obj = c1;//auto-up/implicit up casting--> Parent obj = c1 = new Child(); --> Parent obj = new Child();
		obj.show();
		obj.callme();
		obj.myHome();
		//obj.readme();
		System.out.println("****************Ref GrandParent and Object of child*********************");
		GrandParent g11=c1;//auto-up/implicit up casting-->GrandParent g11=c1=new Child();--> GrandParent g11=new Child();
		g11.myHome();
	}

}
