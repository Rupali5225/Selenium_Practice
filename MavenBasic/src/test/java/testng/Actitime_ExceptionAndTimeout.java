package testng;

import org.testng.annotations.Test;

public class Actitime_ExceptionAndTimeout {
@Test(expectedExceptions=ArithmeticException.class)

public void dividedByZeroExample1(){
	System.out.println("Exception test");
	int e = 1/0;
	System.out.println("Exception handling done");
  }
}
