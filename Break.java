package core_java;
/**Write a program to demonstrate the example of a break/Continue statement 
 * (E.g. Use the loop for 10 numbers and stop the execution after 7 numbers number)
 *  */

public class Break 
{
	public static void main(String [] args)
	{
		int i=1;
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
			if(i==7) //contional statment
			{
				break;
			}
				
		}
		System.out.println("came outside"+i);
	}	
}
