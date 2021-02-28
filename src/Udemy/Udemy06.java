package Udemy;

import java.util.Scanner;

public class Udemy06 {
	public static void main(String[]args) {
		
		//Kullanicidan Vize1,Vize2 ve Final notunu alarak bir harf hesaplama sistemi yapamaya calsin.
		//Ayrica kullanicidan okuldaki genel ortalamasini alarak;
		//DD alma ve 2.50'nin altinda olma kosuluna gore ekrana bir tavsiye yazdirin.
		
		 //Vize1 toplam notun %30'una etki edecek.
		
		//Vize 2 toplam notun %30'una etki edecek.
		
		//Final toplam notun %40'ina etki edecek.
		
		Scanner scan=new Scanner(System.in);
		System.out.println(" Vize1 :"); 
		int vize1=scan.nextInt();
		System.out.println("Vize2 :");
		int vize2=scan.nextInt();
		System.out.println( "final :");
		int fina =scan.nextInt();
		
		System.out.println("okul ortalamaniz:");
		double ortalama=scan.nextDouble();
		double toplamnot=(vize1*3/10.0) + (vize2*3/10.0)+(fina *4/10.0);
		
		if(toplamnot>=90) {
			System.out.println("AA");
		}else if(toplamnot>=85) {
			System.out.println("BA");
		}else if(toplamnot>=80) {
			System.out.println("BB");
		}else if(toplamnot>=75){
			System.out.println("CB");
		}else if(toplamnot>=70) {
			System.out.println("CC");
		}else if(toplamnot>=65) {
			System.out.println("DC");
		}else if(toplamnot>=60) {
			System.out.println("DD");
			
			if (ortalama<2.50) {
				System.out.println("DD aldiniz ve not oralamaniz dusuk.bu dersi tekrar aliniz.");
			}
		}else if(toplamnot>=55) {
			System.out.println("FD VE KALDINIZ");
		}else {
			System.out.println("FF aldiniz ve kaldiniz");
		}
		
		int i=1;
		
		int j=0;
		
		
		switch(i) {
		case 2:
			j+=6;
		case 4:
			j+=1;
		case 1:
			j+=4;
		default:
			j+=2;
			
			System.out.println("j=" + j);
		}
		

	}
}