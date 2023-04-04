package day14.Abstraction;

abstract class Animal {
	// Abstract method (does not have a body ie incomplte) abstraction = incomplete

	public abstract void AnimalSound();
	//Non Abstarct method /complete method with body
	public void sleep() {
		System.out.println("Zzz");
	}
}

class pig extends Animal {

	@Override
	public void AnimalSound() {
		System.out.println("pid voice");
	}

}

class Dog extends Animal {
	public void AnimalSound() {
		// The body of animalSound() is provided here
		System.out.println("The dog says: bow bow");
	}

}

public class abstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pig p1 = new pig();
		p1.AnimalSound();
		Dog d1=new Dog();
		d1.AnimalSound();
		d1.sleep();
	}

}
