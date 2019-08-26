package TestNG;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	
		// TODO Auto-generated method stub
		@DataProvider(name = "testing") 
		public static Object [][] getData()
		
		{
			Object [][] data = new Object[1][1];
			
			data[0][0]= "https://www.facebook.com/";
			
			return data;
		}

	}

	

	

