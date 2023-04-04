package day6.Assignments.If_else;

public class vowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vowelOrConsonant v1 = new vowelOrConsonant();
		v1.vowelConsonant('l');

	}
	
	void vowelConsonant(char ch) {
		if(ch == 'a') {
			System.out.println("vowel");
		}
		else if(ch == 'e') {
			System.out.println("vowel");
		}
		else if(ch == 'i') {
			System.out.println("vowel");
		}
		else if(ch == 'o') {
			System.out.println("vowel");
		}
		else if(ch == 'u'){
			System.out.println("vowel");
		}
		else {
			System.out.println("consonant");
		}
	}

}
