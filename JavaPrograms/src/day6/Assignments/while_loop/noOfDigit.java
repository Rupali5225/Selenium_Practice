package day6.Assignments.while_loop;

public class noOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int count = 0, num = 360;
	    while (num != 0) {
	        // num = num/10
	        num /= 10;
	        ++count;
	      }
	    System.out.println(+num);
	    System.out.println(+count);

	}

}
