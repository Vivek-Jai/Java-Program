package JavaPractice;

public class Reverse_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 12345;
		int rev=0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println("reverse is:" +rev);
		
		int num1= 12345;
		
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}
	

}
