package Udemy;

import java.util.Scanner;

import com.sun.tools.jdeprscan.scan.Scan;

public class WhilSlaytQ04 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// whileLoop01();
		// whileLoop02();
		WhileLopp03();
	}

	private static void whileLoop01() {
		/*
		 * 4)Type java code by using while loop, Write a program that prompts the user
		 * to input a positive integer. It should then print factorial of that number.
		 * 
		 */
		System.out.println(" Please enter a positive number ");

		int n = s.nextInt();

		int limit = 1;

		int count = 1;

		while (limit <= n) {

			count *= limit;

			limit++;
		}

		System.out.println(count);
	}

	public static void whileLoop02() {
			/*
			 * Type java code by using while loop,
			*Write a program to count the factors of an integer which is entered by user.
			 * 
			 */
		
			System.out.println("Please enter an integer");
			int a=s.nextInt();
			
			int d=1;
			
			int result=1;
			while(d<=a) {
				result=result*d;
			
				System.out.println(result);
						
				d++;
			}

	public static void WhileLopp03() {
		/*
		 * Type java code by using while loop, Write a program that prompts the user to
		 * input an integer. It should then find sum of the digits of that number.
		 * 
		 */
		System.out.println("Please enter an integer");
		int i=s.nextInt();
		
		int d=0;
		while(i>=d) {
			if(i%10==0);
			System.out.println("++;
		}
			

	}

}
