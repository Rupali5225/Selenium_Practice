package day9.FinalKeyword;

/**
* anything declared with final keyword known as constant
* any variable declared with final keyword should initialize at the same time
*
*/
public class finalKeywordDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
			final int age=20;
			System.out.println("age: "+age);
			//age=25;  this line will throw error
			System.out.println("age: "+age);
			//age=30;
			System.out.println("age: "+age);
			//age=34;
			System.out.println("age: "+age);
		
	}

}
