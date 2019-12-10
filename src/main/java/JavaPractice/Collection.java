package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hashtable <Integer,String> hm = new Hashtable <Integer,String>();
		
		hm.put(1, "java");
		hm.put(2, "c#");
		hm.put(3, "php");
	
		
		 Set<Integer> st =hm.keySet();
		 
		      //Iterator<Integer> it=  st.iterator();
		Iterator<Integer> it = hm.keySet().iterator();
		      
		      while(it.hasNext())
		      {
		    	  
		    	  Integer str = it.next();
		    	  String value = hm.get(str);
		    	  
		    	  
		    	  System.out.println("the int values are: "+ str + "\t values: " +value);
		    	  
		      }
		
		
		
		/*Map <String, String> mp = new HashMap<String, String>();
		
		mp.put("one", "vivek");
		mp.put("two", "vijay");
		mp.put("three", "Rajesh");
		
		Iterator<String> it = mp.keySet().iterator();
		
		while(it.hasNext())
		{
			
			String key = it.next();
			
			String value = mp.get(key);
			System.out.println(" The key is :" +key + " the values:" +value);
			
		}*/
		      
		      
		      /*HashSet<String> hset = new HashSet<String>();
		      
		      //add elements to HashSet
		      hset.add("Chaitanya");
		      hset.add("Rahul");
		      hset.add("Tim");
		      hset.add("Rick");
		      hset.add("Harry");
		  
		      Iterator<String> it = hset.iterator();
		      while(it.hasNext()){
		         System.out.println(it.next());
	}*/
		
		/*List<String> al=new ArrayList<String>();    
        al.add("Amit");    
        al.add("Vijay");    
        al.add("Kumar");    
        al.add("Sachin");    
        ListIterator<String> itr=al.listIterator();    
           
        while(itr.hasNext()){    
              
        System.out.println(itr.next()); 
        }    */

}
}
