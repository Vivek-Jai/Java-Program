package JavaPractice;

public class MaximumNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[] [] ={{1,10,6},
				        {6,8,9},
				       {21,3,7}};
		
		int min = abc[0] [0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]>min)//Greater //if(abc[i][j]<min)//Smaller
				{
					min = abc [i] [j];
				}
			}
		}
		System.out.println(min);
	}

}
