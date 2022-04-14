package core_java;

import java.util.Scanner;

/**  Write a program to find the current month name from the given number of the switch case
 * 
 * @author RAVI*/
public class SwitchCase 
{
	public static void main(String [] args)
	{	
		SwitchCase.show();// call the method
	}
	/* This function used to saw month name by number */
	static void show()
	{
		System.out.println("Enter your choice");
		Scanner sc =new Scanner(System.in);
		int choice = sc.nextInt();  			//declare the choice as input variable
		
		switch (choice) 						//switch case statement
		{
		case 1: 
		{
			System.out.println("Month is January");
			break;
		}
		case 2:
		{
			System.out.println("Month is Febuary");
			break;
		}
		case 3: 
		{
			System.out.println("Month is March");
			break;
		}
		case 4: 
		{
			System.out.println("Month is April");
			break;
		}
		case 5: 
		{
			System.out.println("Month is May");
			break;
		}
		case 6: 
		{
			System.out.println("Month is June");
			break;
		}
		case 7: 
		{
			System.out.println("Month is July");
			break;
		}
		case 8: 
		{
			System.out.println("Month is August");
			break;
		}
		case 9: 
		{
			System.out.println("Month is September");
			break;
		}
		case 10: 
		{
			System.out.println("Month is October");
			break;
		}
		case 11:
		{
			System.out.println("Month is November");
			break;
		}case 12:
		{
			System.out.println("Month is December");
			break;
		}
		default:
		{
			System.out.println("Unexpected value: " + choice);
		}
		
		}		
		
	}
	
}
