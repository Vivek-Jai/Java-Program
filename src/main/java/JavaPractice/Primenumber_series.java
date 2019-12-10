package JavaPractice;

public class Primenumber_series {
	
	
	public static boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	
	public static void getPrimenumbers(int num)
	{
		for(int i=2; i<=num;i++)
			
		{
			if(isPrime(i))
			{
			System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("12 is prime number " + isPrime(12));
		getPrimenumbers(11);
		
		

	}

}
