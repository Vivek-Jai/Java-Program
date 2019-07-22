package JavaPractice;

import java.util.Arrays;

public class String_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="Vivek";
		String str2="vevki";
		
		//Converting both the string to lower case.  
        str1 = str1.toLowerCase();  
        str2 = str2.toLowerCase();  
		
		if(str1.length()!=str2.length())
		{
			System.out.println(" The String is not Anagram");
		}
		else
		{
			 //Converting both the arrays to character array  
            char[] string1 = str1.toCharArray();  
            char[] string2 = str2.toCharArray();  
		
		
		 //Sorting the arrays using in-built function sort ()  
        Arrays.sort(string1);  
        Arrays.sort(string2); 
        
      //Comparing both the arrays using in-built function equals ()  
        if(Arrays.equals(string1,string2) == true) {  
            System.out.println("Both the strings are anagram");  
        }  
        else {  
            System.out.println("Both the strings are not anagram");  
        }  
	}

}
		
}
