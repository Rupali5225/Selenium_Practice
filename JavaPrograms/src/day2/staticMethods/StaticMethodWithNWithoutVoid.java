package day2.staticMethods;
// TODO create a method to add two number
// TODO create a method to multiple two number and add 100 on the result

public class StaticMethodWithNWithoutVoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addTwoNumbers(10, 20);
		multiplyTwoNum(10,2);
		int res = multiplyTwoNum(10,2);
		int finalresult = res+100;
		System.out.println("result"+finalresult);

	}
	static void addTwoNumbers(int n1,int n2) {
		int res;
		res =  n1+n2;
		System.out.println("additon of 2 no is:"+res);
	}
	static int multiplyTwoNum(int n1,int n2) {
		int res = n1*n2;
		return res;
	}
}
