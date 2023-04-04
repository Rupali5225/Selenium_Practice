package day2.staticMethods;

public class StaticMethods {
	public static void main(String[] args) {
		displayPersonalInfo();
		AcceptAndDisplayInfo("rupali bankar",950,'a');
}
public static void displayPersonalInfo() {
	System.out.println("My name is rupali");
}
public static void AcceptAndDisplayInfo(String name,int mob_no,char m) {
	System.out.println("name"+name);
	System.out.println("mob_no"+mob_no);
}
}