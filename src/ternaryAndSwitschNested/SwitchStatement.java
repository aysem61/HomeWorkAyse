package ternaryAndSwitschNested;

import java.util.Scanner;

public class SwitchStatement {

    static 	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		grade();
	}

	private static void grade() {
		// TODO Auto-generated method stub
		System.out.println("Please enter your grade ");
		
		int num=sc.nextInt();
		
		switch(num) {
		case 40:
		case 50:
			System.out.println(" Your grade is  C ");
			break;
		case 80:
			System.out.println(" Your grade is  B ");
			break;
		case 81:
		case 100:
			System.out.println(" Your grade is  A ");
			break;
		default:
			System.out.println(" Your grade is  unknown  ");
			break;
		}
	}

}
