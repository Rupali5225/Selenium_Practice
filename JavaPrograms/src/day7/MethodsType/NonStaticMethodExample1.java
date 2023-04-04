package day7.MethodsType;
/*		//to access non-static member create an instance of the class
*/
public class NonStaticMethodExample1 {

	public static void main(String[] args) {
		//to access non-static member create an instance of the class
		NonStaticMethodExample1 e1=new NonStaticMethodExample1();
		e1.displayPersonalInfo();
		e1.displayPersonalInfo();
		//when you want to display information with Dynamic values
		e1.displayPersonalInfo("Jay","Manual","Pune");
		e1.displayPersonalInfo("Amar","API","Bangalore");
		//execute calling method
		e1.calling(123456);
		e1.calling(9876542);
		int i=6568983;
		e1.calling(i);
	}
	public void displayPersonalInfo() {
		System.out.println("Hi, I am shailesh");
		System.out.println("I am your automation trainer");
		System.out.println("I am from UP");
	}
	public void displayPersonalInfo(String name,String prof,String location) {
		System.out.println("Hi, I am "+name);
		System.out.println("I am your "+prof+" trainer");
		System.out.println("I am from "+location);
	}
	public void calling(int num) {//int num=i=6568983
		System.out.println("Hi, I am xyz");
		System.out.println("calling using number: "+num);
	}

}
