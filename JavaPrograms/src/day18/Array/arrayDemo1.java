package day18.Array;

public class arrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] cars = new String[5];
//		cars[0]="Volvo";
//		cars[1]="BMW";
//		cars[2]="Ford";
//		cars[3]="Mazda";
		
		//OR
		
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		// Access the Elements of an Array
		System.out.println(cars[1]);
		// Change an Array Element
		cars[1] = "R";
		System.out.println(cars[1]);
		// array element count
		System.out.println(cars.length);
		// iterate array elements using for loop
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println("**************for-each loop*******************");
		// iterate array elements using for-each loop
		for(String i:cars) {
			System.out.println(i);
		}

		
		
	}

}
