package day6.Assignments;

public class swapWithTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapWithTemp s1 = new swapWithTemp();
		s1.swap(2, 8);

	}

	void swap(int a, int b) {
		int c;
		c = a;
		a = b;
		b = c;

		System.out.println("value of a is" + a);
		System.out.println("value of b is " + b);

	}
}
