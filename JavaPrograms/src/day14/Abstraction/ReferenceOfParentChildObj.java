package day14.Abstraction;

abstract class Bike1 {
	abstract void run();

	void speed(int i) {
		System.out.println("I am bike" + i);
	}
}
class honda extends Bike1 {

	@Override
	void run() {
		System.out.println("hello honda");
	}
	void speed(int i) {
		System.out.println("I am honda speed" +i);
	}
	void color() {
		System.out.println("Honda1 color is blue");
	}
}

public class ReferenceOfParentChildObj {

	public static void main(String[] args) {
		honda h1 = new honda();
		h1.run();
		h1.speed(2);
		//*********//Bike1 b1=new Bike1();// we can't create an object of abstract class Bike
		Bike1 b1 = new honda();
		b1.run();
		b1.speed(6);
		//b1.color();  //cant access bcoz method is  not present in bike class	
	}

}
