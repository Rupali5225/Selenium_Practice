package day25.Exception_handling;

public class trialException extends Exception {
	public trialException(String str) {
		super(str);
	}

	public static void validate(int age) throws trialException  {
		if(age<18) {
			 throw new trialException("invalid age");
		}
		else {
			System.out.println("Person is eligible to vote!!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(1000);
		}
		catch (trialException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code..");

	}

}
