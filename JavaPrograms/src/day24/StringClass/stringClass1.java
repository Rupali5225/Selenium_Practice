/**
		 * Outside String class:
		 * 		== --> compare two values
		 * 		.equals(obj) --> compare two objects based on there address
		 * Inside String class:
		 * 		== --> compare two objects based on address
		 * 		.equals(obj) --> compare two objects based on value
		 */
package day24.StringClass;

public class stringClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringClass1 c1 = new stringClass1();
		System.out.println(c1);
		// String class object creation using literal
		String s1 = "Mumbai";//New obj created in string constant pool
		String s2 = "Mumbai";//no object will be create as its a duplicate object, so 's2' will points to 's1' object
		String s3 = "Banglore";//new object will be create in string constant pool
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		System.out.println("s1 char count: "+s1.length());
		System.out.println("s2 char count: "+s2.length());
		System.out.println("s3 char count: "+s3.length());
		
		System.out.println("s1 and s2 using equals" +s1.equals(s2)); //compare s1 and s2 values
		System.out.println("s1 == s2"+(s1== s2));
		
	}

}
