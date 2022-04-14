package core_java;

/**
 * Write a program to demonstrate the use of while loop and while loop. (E.g
 * print 1 to 10 numbers).
 */

public class While {
	// This used to print 10 number
	public void show() {
		int i = 1;
		while (i <= 10) // condition
		{
			System.out.println("The Number is " + i);
			i++; // increment the number
		}
	}

	public static void main(String[] args) {
		While ob = new While(); // object is created
		ob.show(); // method call
	}
}
