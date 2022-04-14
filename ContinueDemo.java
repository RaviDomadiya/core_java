package core_java;

public class ContinueDemo 
{
	public static void main(String [] args)
	{
		int i=1; 
		for(i=1;i<=10;i++) //for loop
		{
			if(i==5)
			{
				continue;//continue statement for skip the value
			}
			System.out.println(i);
		}
	}

}
