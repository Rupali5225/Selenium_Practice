package day15.Interface;
//when any interface extends another interface then method in parent called as virtual in child if its not define
//and whn child interface implented by any subclass then mandatory to override methods of both child(Showable2)+parent(Printable2) interfce
 interface Printable2 {
	void print();
}
interface Showable2 extends Printable2 {
	void show();
	//public abstract void print(); ---> inherited method/virtual method
}
public class VirtualMethod implements Showable2 {
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Welcome");
	}
	public static void main(String args[]) {
		VirtualMethod obj = new VirtualMethod();
		obj.print();
		obj.show();
		Printable2 obj2 = new VirtualMethod();
		obj2.print();
		//obj2.show();
	}
}