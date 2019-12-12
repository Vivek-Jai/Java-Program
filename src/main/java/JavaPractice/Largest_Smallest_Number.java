package JavaPractice;

public class Largest_Smallest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[]={10,20,30,40,50};
		
		int largest =number[0];
		
		int smallest = number [0];
		
		for (int i=1;i<number.length;i++)
		{
			if(number[i]>largest)
			{
				largest =number[i];
			}
			
			else if(number[i]<smallest)
			{
				smallest=number[i];
			}
		}
		
System.out.println("Largest number is:"+largest);
System.out.println("smallest number is:"+ smallest);
	}

}
