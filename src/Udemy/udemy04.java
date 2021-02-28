package Udemy;

import java.util.Scanner;

public class udemy04 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int islem=scan.nextInt();
		 
		
		//switchcase
		switch(islem) {
		  case 1:
			  System.out.println("1.islem");
			  
		  case 2:
			  System.out.println("2.islem");
			  
		  case 3:
			  System.out.println("3.islem");
			  break;
		  case 4:
			  System.out.println("4.islem");
			  
		default:
			System.out.println("gecersiz islem");
			break;
		}
			  // break kullanilirsa ;islemi yapiyor ve break yazisini gorunce orda bitiriyor,
			//diger islemlere bakmiyor.break yazisi olmayinca  islemlerin hepsini kontrol edip yaziyor.
			  
		

 
		//Mini Proje;kullanicidan alinan 3 sayidan en buyuk sayiyi bulma
			
			System.out.println("birinci sayi");
			int a=scan.nextInt();
			
			System.out.println("ikinci sayi");
			int b=scan.nextInt();
			
			System.out.println("ucuncu sayi");
			int c=scan.nextInt();
			
			int maks=-1;
			
			if(a>=b && a>=c) {
				maks=a;
			}
			else if(b>=a && b>=c) {
			    maks=b;
			}
			else {
				maks=c;
			}
			System.out.println("maksimum sayi:"+ maks);
			
			
	//kosullara gore beden kitle endeksini hesaplayin.
			System.out.println("kilonuzu girin");
			int kilo=scan.nextInt();
			
			System.out.println("boyunuzu giriniz");
			double boy=scan.nextDouble();
			
			
			double bki=(kilo/(boy*boy));
			
			System.out.println("bki:" +(kilo/(boy*boy)));
			
			if(bki<18.5) {
				System.out.println("Zayif");
			}
			else if(bki>=18.5 && bki<25) {
				System.out.println("Normal");
			}
			else if(bki>=25 && bki<30) {
				System.out.println("Fazla Kilolu");
			}
			else {
				System.out.println("Obez");
			}
	
	}			
					
}	
			



