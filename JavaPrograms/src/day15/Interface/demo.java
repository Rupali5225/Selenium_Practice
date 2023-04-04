package day15.Interface;


interface Printable {
	int age=30;//by default public static final
	void print();
}
interface Showable {
	public void show();
}
public class demo implements Printable, Showable {
	public static int age=45;
	public void print() {
		System.out.println("Hello, print");
	}
	public void show() {
		System.out.println("Welcome, show");
	}
	public static void main(String args[]) {
		demo obj = new demo();
		obj.print();
		obj.show();
		System.out.println(Printable.age); ////by default public static final so we can access static members with classname.varname
		System.out.println(demo.age);
	}
}
