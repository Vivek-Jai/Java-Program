package JavaPractice;

public class Print_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "this is java";
		
		int cCount = 0;
		
		int count = 0 ;
		
		for(int i=0;i<str.length();i++)
		{
			
			
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
			{
				
				
				count++;
				
				
			}
			
			else if(str.charAt(i) >= 'a' && str.charAt(i)<='z')
			{      
                //Increments the consonant counter    
                cCount++;    
			
			
		}
			
			
		}
		System.out.println("Number of vowels: " + count);    
        System.out.println("Number of consonants: " + cCount);  
	}
}
		

	
