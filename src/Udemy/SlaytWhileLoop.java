package Udemy;

import java.util.Scanner;

public class SlaytWhileLoop {

	public static void main(String[] args) {
		//printnum();
		//printodd();
		printMultip();
		
		
		//int i=0;
		//while(i<5) {
		//	System.out.print(i);
		//	i++;
		}
		
		//1)Type java code by using while loop,
		//Write a program to print numbers from, 1 to 5.
		
		public static void printnum() {
			int i=1;
			while(i<5) {
				System.out.print(i);
				i++;
			}
		}
		//2)Type java code by using while loop,
		//Write a program that types first 30 consecutive odd integers.
		
		public static void printodd() {
		int i=1;
		while(i<30) {
			if(i%2!=0) 
		
			System.out.print(i);
			i++;
		}
		
		}
		//3)Type java code by using while loop,
		//Write a program that prompts the user to input a positive integer.
		//It should then print the multiplication table of that number.
		
		public static void printMultip() {
			
			
			System.out.println(" please enter a number in order to see its multiplications ");
			
			Scanner s=new Scanner(System.in);
			int user=s.nextInt();
			
			int j=1;
			
			while(j<=10) {
				
				System.out.println(""+user+" x "+j+"="+(user*j)+" ");
				j++;
			}
			
			s.close();
		}
		
		
		
}	

		
