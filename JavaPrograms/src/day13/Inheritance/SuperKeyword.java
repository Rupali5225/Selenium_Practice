package day13.Inheritance;
/*Super keyword is use to call immediate parentclass's constructor
 *-It should be the first line of base class
 *-It is used to differentiate between parent and child classs constructor when name of boths constructor are same
 
 */


class fruit
{
	fruit(){
		System.out.println("I am fruit classs cons");
	}
}

class apple extends fruit{
	apple(){
		super();// used to call parent class cons if we do not write it still java compiler will writ default cons
		System.out.println("I am apple cons");
	}
	
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		apple fr = new apple(); // object of child class


	}

}
