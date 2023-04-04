package day25.Exception_handling;

public class throwKeyword extends Exception {
		public throwKeyword(String str) {
			// Calling constructor of parent Exception
			super(str);
		}

	

	public static void validateAge(int age) throws throwKeyword {
		if (age < 18) {
			// throw Arithmetic exception if not eligible to vote
			throw new throwKeyword("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}
	public static void main(String args[]) {
		
		System.out.println("I am main of ExceptionHandling12_1");		
	
		try {
			validateAge(15);
		} catch (throwKeyword e) {
			//e.printStackTrace();
			System.out.println(e);
		}	
		System.out.println("Rest of the code..");
	}
	}


