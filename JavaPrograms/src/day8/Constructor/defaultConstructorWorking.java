package day8.Constructor;
/*  below is default constructor, that will be written by java compiler at compile time
for int = 0
floate = 0.0
string = 0.0
*/
public class defaultConstructorWorking {
	
		int age;
		double salary;
		char c_var;
		/**
		 *  below is default constructor, that will be written by java compiler at compile time
		  Cons2(){
				//empty body
			}
		*/

		public static void main(String[] args) {

			defaultConstructorWorking c1 = new defaultConstructorWorking();
			System.out.println(c1.age);// 0
			System.out.println(c1.salary);// 0.0
			System.out.println(c1.c_var);
		}

}
