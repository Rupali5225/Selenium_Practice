package Package1;

public class Operators {

	public static void main(String[] args) {
//		int a = 10;
//		int b = a;
//		System.out.println("a: " + a);
//		System.out.println("b: " + b);
//		/**
//		 * pre: first perform the operation dn use the updated value 
//		 * post: first use the value dn perform the operation
//		 */
//		int k = ++a;
//		System.out.println("k: " + k);//
//		System.out.println("a: " + a);//
//		int j = k++;//
//		System.out.println("k: " + k);//
//		System.out.println("j: " + j);//
//		
//		int r = 21;
//		System.out.println("r=: " + r++);//
//		System.out.println("r=: " + r);//
//		System.out.println("r=: " + ++r);//
//		System.out.println("r=: " + r);//
//
//		int x = 105;
//		System.out.println("x=: " + ++x);// 
//		System.out.println("x=: " + x--);// 
//		System.out.println("x=: " + x++);// 
//		System.out.println("x=: " + --x);// 
//		
//		System.out.println("*************");
		
		int a = 0, b;
		b = a++ + ++a + ++a + a;
		
		System.out.println("a: "+a);// 
		System.out.println("b: "+b);// 
		System.out.println("**********************");
		a = -5;
		b = a-- + --a + --a + a;
	 
		System.out.println("a: "+a);//  
		System.out.println("b: "+b);//  

		a = 21;
		b = --a + --a + --a + a + ++a + a++;

		System.out.println(a);// 
		System.out.println(b);// 

		a = -2;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		System.out.println(a);//
		System.out.println(b);//

	}

}
