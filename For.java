package core_java;
/**
 * For loop to print the star pattern*/

public class For 
{
	public static void main(String [] args)
	{
	int i,j;
	for(i = 1; i <= 5 ;i++)    	//this loop use row
	{
		for(j = 1; j <= i; j++)// this loop use for column
		{
			System.out.print("*");// print star
		}
		System.out.println();
			
	}
	
	}

}
