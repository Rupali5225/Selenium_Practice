package day6.Assignments;

public class quotientNReamainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quotientNReamainder q1 = new quotientNReamainder();
		q1.quotient(10, 10);

	}

	void quotient(int num1, int num2) {
		int quotient = num1 / num2;
		int reamainder = num1 % num2;
		System.out.println("quotient" + quotient);
		System.out.println("Reaminder" + reamainder);
	}

}
