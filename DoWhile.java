package core_java;

/** Write a program to demonstrate the use of do while loop. (E.g print 1 to 10 numbers).*/

public class DoWhile 
{
	public static void main(String[] args)
	{
		DoWhile.show(); //method call
	}
	
	/** This method used to print 10 number*/
	
	public static void show() 
	{
		int i = 1; 
		do 
		{
			System.out.println("The number is" + i);
			i++;		//increment
			
		} while (i <= 10);
	}

}
