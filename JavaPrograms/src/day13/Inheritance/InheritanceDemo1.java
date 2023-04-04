package day13.Inheritance;

class testing101 {
	// default constructor
	void callingFromVoda() {
		System.out.println("Vodaphone network busy");
	}
}
class testing20 extends testing101{
	//default constructor with default super()
	void callingFromIdea() {
		System.out.println("Get Idea sirji");
	}
}
class testing30 extends testing20{
	//default constructor with default super()
	void callingFromAirtel() {
		System.out.println("try evrything is working as per the requirment");
	}
}
 public class InheritanceDemo1 extends testing30 {
		void callingMe() {
			System.out.println("I am calling....");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceDemo1 e1 = new InheritanceDemo1();
		e1.callingMe();
		e1.callingFromAirtel();
		e1.callingFromIdea();
		e1.callingFromVoda();
		}
}
