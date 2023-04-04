package day6.Assignments.for_loops;

public class displayNumOneToFive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayNumOneToFive d1 = new displayNumOneToFive();
		d1.display(5);

	}
	void display(int num) {
		for(int i=1;i<=num;i++) {
			System.out.println(+i);
		}
	}

}
