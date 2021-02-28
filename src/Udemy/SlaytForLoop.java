package Udemy;

import java.util.Scanner;

public class SlaytForLoop {

	public static void main(String[] args) {
		//printEvenInt1();
		//printEvenInt2();
		//printString1();
		//printNumbers1();
		//printEvenInt3();
		//printOdd();
		//printAdd();
		printMultiply();
		
		//printDiv();
	}
	/*
	 * Print all even integers from 100 to 23 on the console in the same line with a
	 * space among them
	 */
	
	public static void printEvenInt1() {
		for(int i=100; i>=94; i=i-1) {
			System.out.println(i + " ");
		
		}	
		
	}

	
	/*
	 * Print all integers which are divisble by 5 from 100 to 23 on the console in
	 * the same line with a space among them
	 */
	
	public static void printEvenInt2() {
		
		for(int i=100; i>=22; i--) {
			if(i%5==0) {
				System.out.println(i + " ");
			}
		}
		}
		// INTERVIEW QUESTION
		/*
		 * 1)Ask user to enter a String 2)Print the String reverse For example; Germany
		 * ===> ynamreG
		 */
		
		
		public static void printString1() {
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter a String");
			
			String t=scan.nextLine();
			
			for(int i=t.length()-1; i>=0; i--) {
				System.out.print(t.charAt(i));
			}
		}
		
		
		/*
		 * Write a program to print counting numbers from 10 to 57 on the console by using for-loop.
		 */
		
		public static void printNumbers1() {
			
			for(int i=57; i>10; i--) {
				System.out.print(i + " ");
			}
		}
		
		/*
		 * Write a program to print even counting numbers from 100 to 43 on the console by using for-loop.
		 */
		
		public static void printEvenInt3() {
			for(int i=100; i>43; i--) {
				if(i%2==0) {
					System.out.print(i + " ");
				}
			}
			
		}
			/*
			 * Write a program to print odd counting numbers from 200 to 33 on the console by using for-loop.
			 */
			
			
			public static void printOdd() {
				for(int i=200; i>=33; i=i-1) { 
					System.out.print(i + " ");
				}
				
		}
			
			
			/*
			 * Write a program to add counting numbers from, 23 to 57 by using for-loop.
			 * Print the sum on the console
			 * 
			 */
			
			
			public static void printAdd() {
				int sum=0;
				
				for(int i=57; i>=23; i--) {
					sum=sum+i;
				}	
					System.out.print(sum + "add");
				
			}
			
			/*
			 * Write a program to multiply counting numbers from, 7 to 15 by using for-loop.
			 * Print the multiplication on the console
			 * 
			 */
			
			public static void printMultiply() {
				int count=1;
				for(int i=15; i>7; i--) {
					
					count=count*i;
				}
				
				System.out.println(count + " ");
				
			}
			/*  Write a program to print  counting numbers which ares less than 200 and divisible by5. 
			 * On the console by using for-loop
			 */
			public static void printDiv() {
				for(int i=200; i>=5; i=i-5) {
					System.out.print(i  + " ");
				}
			}
			
		}
		
	
	
	

