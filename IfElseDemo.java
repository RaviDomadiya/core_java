package core_java;

import java.util.*;

/**
 * Write a program to demonstrate the use of if / else statements. (E.g Define
 * an 'age' variable and check your age)
 * 
 * @author RAVI
 *
 */

public class IfElseDemo {

	public static void main(String[] args) {

		IfElseDemo.show(); // call the static function
	}

	/**
	 * This Method used to compare the age
	 */
	static void show() {

		int ADULT = 19;
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age <= 0) // conditional statement
		{
			System.out.println("you put wrong choice");
		} else if (age > 0 && age <= 1) {
			System.out.println("you are infant");
			System.out.println("your age is" + age);

		} else if (age > 1 && age <= 12) {
			System.out.println("you are child");
			System.out.println("your age is" + age);
		} else if (age >= 13 && age <= 19) {
			System.out.println("your are teenager");
		} else if (age > ADULT && age < 25) {
			System.out.println("you are young");
		} else if (age > 25 && age < 50) {
			System.out.println("you are adult");
		} else if (age > 50) {
			System.out.println("you are oldge");
		}

	}
}