package day29.ImmutableClasses;


final class TestImmutableClass{
	final String name;
	final int salary;
	
	TestImmutableClass(String n1,int s1){
		this.name = n1;
		this.salary = s1;
	}
	
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
}
public class ImmutableClass {
	public static void main(String args[]) {
		TestImmutableClass t1=new TestImmutableClass("Nitin",25000);
		System.out.println(t1.toString());
		//t1.name = "asdnkjasn"; // trhows error
		System.out.println(t1.toString());

		System.out.println(t1.getName());
		System.out.println(t1.getSalary());

	}

}
