package Practice_Pr_TP;

public class string_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rupali ban";
		String s2 = new String();

		for (int i = s.length() - 1; i >= 0; i--) {
			s2 = s2 + s.charAt(i);
		}
		System.out.println(s2);

		/* count characters in string */
		System.out.println("length of string : " + s.length());

		/* string is pali or not */
		if(s.equals(s2))
			System.out.println("string is palindrom");
		else 
			System.out.println("string is not a palindron");
		
		/*string to title case*/
		String tittlecase = "";
		tittlecase = s.toUpperCase();
		System.out.println("title case : " +tittlecase);
		
		/*remove white spaces from string*/
		String removespace = "";
		removespace = s.replaceAll("\\s", "");
		System.out.println("removed white spaces string :" +removespace);
		
		/*find repeated characters in string8*/
		  String string1 = "Great rt";    
	        int count;    
	            
	        //Converts given string into character array    
	        char string[] = string1.toCharArray();    
	            
	        System.out.println("Duplicate characters in a given string: ");    
	        //Counts each character present in the string    
	        for(int i = 0; i <string.length; i++) {    
	            count = 1;    
	            for(int j = i+1; j <string.length; j++) {    
	                if(string[i] == string[j] && string[i] != ' ') {    
	                    count++;    
	                    System.out.print(string[j] + " ");
	                    //Set string[j] to 0 to avoid printing visited character    
	                   // string[j] = '0';    
	                }    
	            }    
	            //A character is considered as duplicate if count is greater than 1    
	          //  if(count > 1 && string[i] != '0')    
	            //    System.out.println(string[i]);    
	        }    

	}

}
