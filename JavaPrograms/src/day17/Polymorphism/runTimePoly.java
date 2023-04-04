package day17.Polymorphism;


	class Vehicle {
		// defining a method
		void run() {
			System.out.println("Vehicle is moving");
		}
	}
	// Creating a child class
	class Car2 extends Vehicle {
		// defining the same method as in the parent class
		void run() {
			System.out.println("car is running safely");
		}
	}
	public class runTimePoly {
		public static void main(String args[]) {
			System.out.println("Program Starts");
			Car2 obj = new Car2();// creating object
			obj.run();// 
			System.out.println("Program Ends");
		}
	}

/*runtime poly achieved with the help of overrridng
 * overrridngachive with inheri
 * inheri is only for non-static members
 * and non-static loaded into the memo at the time of execution when obj are created
 * so runtime poly achive with overriding through inheri
 */
