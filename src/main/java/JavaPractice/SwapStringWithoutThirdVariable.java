package JavaPractice;

public class SwapStringWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello vivky"; 
        String b = "World"; 
          
        // Print String before swapping 
        System.out.println("Strings before swap: a = " +  
                                       a + " and b = "+b); 
          
        // append 2nd string to 1st 
        a = a + b; 
        
        System.out.println(a);
          
        // store intial string a in string b 
        b = a.substring(0,a.length()-b.length()); 
          
        // store initial string b in string a 
        a = a.substring(b.length()); 
          
        // print String after swapping 
        System.out.println("Strings after swap: a = " +  
                                     a + " and b = " + b);   
        
       /* String Str = new String("Welcome to geeksforwhite"); 
        
       
        System.out.println(Str.substring(0,10)); */
    }     
	}


