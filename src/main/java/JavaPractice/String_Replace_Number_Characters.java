package JavaPractice;

public class String_Replace_Number_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder str = new StringBuilder("vi2345#$%^&ek");
		
		
		
		for(int i =0 ;i<str.length();i++)
		{
			char k  =  str.charAt(i);
		if(!Character.isLetter(k))
		{
		
		 str.setCharAt(i, '@');
		}

	}
		
		System.out.println(str);

}
}
