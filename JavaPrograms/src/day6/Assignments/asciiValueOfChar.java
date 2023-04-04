package day6.Assignments;

public class asciiValueOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		asciiValueOfChar a1 = new asciiValueOfChar();
		a1.AsciiVal('c');
	}
	void AsciiVal(char ch) {
		int value = ch;
		System.out.println("ASCII value of char" +ch + "is" + +value);
	}
}
