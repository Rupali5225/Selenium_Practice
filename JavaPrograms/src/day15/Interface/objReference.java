package day15.Interface;
interface Printable1 {
	void print();
}
interface Showable1 {
	void print();
}
public class objReference implements Printable1, Showable1 {
	public void print() {
		System.out.println("Hello");
	}
	public static void main(String args[]) {
		objReference obj = new objReference();
		obj.print();
		Showable1 obj1 = new objReference();
		obj1.print();
		Printable1 obj2 = new objReference();
		obj2.print();
	}
}


