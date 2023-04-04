package day11.thisKeyword;

/**
 * this keyword is predefined keyword, also known as instance of current class
 * ideally used to differentiate local and global variable(NSGV) when they are
 * having same name this should be used only for non-static member and inside
 * non-static
 */
public class thisKeywordDemo1 {
	int age = 25;

	public static void main(String args[]) {
		int age = 26;

		thisKeywordDemo1 t1 = new thisKeywordDemo1();
		t1.display();
	}

	void display() {

		// age = this.age;
		System.out.println(+this.age);
	}
}
