package JavaPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList <String> ar = new ArrayList();
		
		ar.add("one");
		ar.add("two");
		ar.add("three");
		
		/*for (int i=0; i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}*/
		
		                   Iterator<String> it=ar.iterator();

		                   
		                   while(it.hasNext())
		                   {
		                	   System.out.println(it.next());
		                   }
	}

}
