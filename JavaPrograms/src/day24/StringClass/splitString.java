package day24.StringClass;

public class splitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="I am from UP, I am workig in Accenture, I working as QA Deleivery Head";
		System.out.println("Actual String: "+s1);
		String[] strAry=s1.split(" ");
		for(String s:strAry) {
			System.out.println(s);
		}
		System.out.println("***************************");
		String s2="I am from UP";
		System.out.println("Actual String: "+s2);
		String[] strAry2=s2.split(" ", 3);
		for(String s:strAry2) {
			System.out.println(s);
		}
		

	}

}
