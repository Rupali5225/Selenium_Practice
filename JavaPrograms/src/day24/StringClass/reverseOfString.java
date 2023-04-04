package day24.StringClass;

public class reverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Mumbai";
		System.out.println(reverseOfString(s1));
		
	}
	
	 static String reverseOfString(String s1) {
		String temp = "";
		for(int i=s1.length()-1;i>=0;i--) {
			temp = temp+ s1.charAt(i);	
		}
		return temp;
	}

}
