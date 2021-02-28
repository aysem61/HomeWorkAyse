package Udemy;

import java.util.Scanner;

public class Udemy03 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter the age:");
		int yas=scan.nextInt();
		
		if(yas<18) {
		System.out.println("You don't come");
		
		}
			
		System.out.println("Please enter the number");
		int number=scan.nextInt();
		
		if(number<0) {
		System.out.println("Negative");	
		}
		else {
		System.out.println("Positive or 0");	
		}
		//
		System.out.println("pleas enter the process");
		int islem=scan.nextInt();
		
		if(islem==1) {
			System.out.println("1.islem");
			
		}
		
		else if(islem==2) {
			System.out.println("2.islem");
			
		}
		else if(islem==3) {
			System.out.println("3.islem");
			
		}
		
		else {
			System.out.println("gecersiz");
		}
		//
		System.out.println("Please enter the note");
		int not=scan.nextInt();
		
		if (not>=90) {
			System.out.println("AA");
		}
		
		else if(not>=80) {
			System.out.println("BA");
		}
		
		else if(not>=70) {
			System.out.println("BB");
		}
		else if(not>=60) {
			System.out.println("CC");
		}
		else if(not>=50) {
			System.out.println("DC");
		}
		else {
			System.out.println("Kaldi");
		}
		
		//switchcase yapilari
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	
	

}
