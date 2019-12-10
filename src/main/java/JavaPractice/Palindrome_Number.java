package JavaPractice;

public class Palindrome_Number {
	
	
	
	public static void isPalindrome(int num)
	{
		int r=0;
		int sum=0;
		int t;
		
		t=num;
		
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		
		if(t==sum)
		{
			System.out.println("The given number is palindrome");
		}
		else
		{
			System.out.println("the given number is not paildrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isPalindrome(152);

	}

}
