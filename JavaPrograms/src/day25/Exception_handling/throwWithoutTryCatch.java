package day25.Exception_handling;

public class throwWithoutTryCatch extends Exception {
	public throwWithoutTryCatch(String str) {
		// Calling constructor of parent Exception
		super(str);
	}



public static void validateAge(int age) throws throwWithoutTryCatch {
	if (age < 18) {
		// throw Arithmetic exception if not eligible to vote
		
		throw new throwWithoutTryCatch("Person is not eligible to vote");
	} else {
		System.out.println("Person is eligible to vote!!");
	}
}
public static void main(String args[]) throws throwWithoutTryCatch {
	
	System.out.println("I am main of ExceptionHandling12_1");		
	try {
		validateAge(60);
	} catch (throwWithoutTryCatch c) {
		//e.printStackTrace();
		System.out.println(c);
	}
		//validateAge(15);
		//IMP Note-  this sentence will not be executed as we havent used try and catch to handle throw
		
	System.out.println("Rest of the code..");
}
}
