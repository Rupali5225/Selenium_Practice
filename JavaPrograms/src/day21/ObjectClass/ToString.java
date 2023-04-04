package day21.ObjectClass;
/**
 * string representation/ToString/object printing---> fullyqualifiedclassname@hexadecimaladdress	
 * 							 packagename.classname@hexadecimaladdress 
 */
class Demo{
	void display() {
		System.out.println("I am display()..");
	}
}

class Example1  extends Demo{
	static int last_rollno = 100;
	int roll_no;
	//constructor
	Example1(){
		roll_no = last_rollno;
		last_rollno++;
	}
	
}
public class ToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1 = new Demo();
		System.out.println("toString of object demo "+d1);//i.e d1.toString //ObjectClass.Demo@6d06d69c
		Demo d3=new Demo();
		System.out.println(d3.toString());	//--->ObjectClass.Demo@6d06d69c   i.e pkgname.classname.@hexadecimal
		
		Demo d2=new Example1();
		System.out.println("address of ob example1  :"  +d2);
		
		Example1 e1=new Example1();
		System.out.println("roll no : "+e1.roll_no);
		System.out.println("last roll no : "+e1.last_rollno);


	}

}
