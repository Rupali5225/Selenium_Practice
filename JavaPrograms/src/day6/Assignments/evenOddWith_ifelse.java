package day6.Assignments;

public class evenOddWith_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenOddWith_ifelse e1 = new evenOddWith_ifelse();
		e1.evenOdd(2);
	}

	void evenOdd(int num1) {
		if (num1 % 2 == 0) {
			System.out.println("given num is even");
		} else {
			System.out.println("given num is odd");
		}
	}
}
