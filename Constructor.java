package core_java;

/**Write a program to demonstrate the example of constructor and Parameterized constructor
 *  (E.g. Pass two integer parameters and apply any mathematical formula
 *  */

class Main
{
	Main(int x, int y)//make the parameterize constructor
	{
		int sum = x+y; // two number sum
		System.out.println("The sum is " +sum);
	}
}

public class Constructor
{
	public static void main(String [] args)
	{
		Main c = new Main(10,20);//parameter give to constructor
	}
		
}
