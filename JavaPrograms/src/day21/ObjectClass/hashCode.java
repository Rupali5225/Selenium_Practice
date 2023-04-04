package day21.ObjectClass;

public class hashCode {
	static int last_roll = 100;
	int roll_no;
	//constructor
	hashCode(){
		roll_no = last_roll;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashCode h1 = new hashCode();
		//
		System.out.println(h1.toString());//string representation of an object
		System.out.println(h1.hashCode());//it convert hexadecimal address in to decimal and return the value
	}

}
