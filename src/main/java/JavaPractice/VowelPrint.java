package JavaPractice;

public class VowelPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String str = "this is java";
		
		char ch  ;
		 
		int count = 0 ;
		
		for(int i=0;i<str.length();i++)
		{
			
			
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
			{
				ch =str.charAt(i);
				System.out.println("the vowels are:" +ch);
				
				count++;
				
				
			}
			
			
	
		}
		
		System.out.println("vowels count are:"+count);

}
}
