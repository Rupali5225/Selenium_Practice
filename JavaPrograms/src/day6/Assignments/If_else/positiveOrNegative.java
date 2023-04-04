package day6.Assignments.If_else;

public class positiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		positiveOrNegative p1 = new positiveOrNegative();
		p1.positiveOrNegative(-9);

	}
	void positiveOrNegative(int num) {
		if(num >0) {
			System.out.println("given num is positive");
		}
		else if(num<0) {
			System.out.println("given num is negative");
		}
		else {
			System.out.println("num is o");
		}
	}
}
