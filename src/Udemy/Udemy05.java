package Udemy;

import java.util.Scanner;

public class Udemy05 {

	public static void main(String[] args) {
	
		//Switch Case kullanarak 4 islem yapan bir hesap makinesi tasarlamaya calisalim.
		Scanner scan=new Scanner(System.in);
		System.out.println("......");
		String islemler="1.toplama islemi\n"
						+"2.cikarma islemi\n"
						+"3.carpma islemi\n"
						+"4.bolme islemi";		
		System.out.println(islemler);
		System.out.println(".......");	
		
		System.out.println("islemi seciniz");
		String islem=scan.nextLine();
		
		int a;
		int b;
		
		switch(islem) {
		case "1":
			System.out.println("birinci sayi"); 
			a =scan.nextInt();
			System.out.println("ikinci sayi");
			b=scan.nextInt();
			System.out.println("toplama islemi:" +(a+b));
			break;
		case "2":
			System.out.println("birinci sayi"); 
			a =scan.nextInt();
			System.out.println("ikinci sayi");
			b=scan.nextInt();
			System.out.println( "cikarma islemi:" +(a-b));
			break;
		case"3":
			System.out.println("birinci sayi"); 
			a =scan.nextInt();
			System.out.println("ikinci sayi");
			b=scan.nextInt();
			System.out.println( "carpma islemi:" +(a*b));
			break;
		case"4":
			System.out.println("birinci sayi"); 
			a =scan.nextInt();
			System.out.println("ikinci sayi");
			b=scan.nextInt();
			System.out.println( "bolme  islemi:" +(double)(a/b));
			default:
			System.out.println("gecersiz islem");
		}
		
	}

}
