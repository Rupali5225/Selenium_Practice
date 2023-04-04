package day24.StringClass;
/* javatpoint and geeks*/

public class ImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String NewString = "Hello";    
        NewString =NewString.concat("World");  
        System.out.println(NewString);  /// string is immutable bu its reference is not immutable
	}

}
