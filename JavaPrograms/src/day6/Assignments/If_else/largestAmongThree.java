package day6.Assignments.If_else;

public class largestAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		largestAmongThree l1 = new largestAmongThree();
		l1.lagrgestNum(1, 1, 2);

	}
	void lagrgestNum(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println( "a is largest");
		}
		else if(b>a && b>c) {
			System.out.println( "b is largest" +b);
		}
		else if(c>a && c>b) {
			System.out.println("c is largest");
		}
		else {
			System.out.println("equal");
		}
	}
}
