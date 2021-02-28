package Udemy;

public class Udemy02 {

	public static void main(String[] args) {
		
		
		System.out.println(3==3);//true
		
		System.out.println(3==4);//false
		System.out.println(3!=4);//true
		System.out.println(3!=3);//false
		System.out.println(2>3);//false
		System.out.println(2>=1);//true
		System.out.println(2>=2);//true
		System.out.println("Mehmet"=="Mehmet");//true
		
		
		
		//&& and operatoru:butun sonuclar kend icinde true ise sonuc true,en az birisi false ise sonuc false.
		
		//|| or operatoru:sonuclardan aen az birisi bile true ise genel sonuc true,hepsi false ise sonuc false.
		
		System.out.println(2>3);
		System.out.println(3==3);
		System.out.println(3==3 && 2>3 &&"Ayse"=="Ayse");//false
		
		System.out.println(3==3 || 2>3 ||"Ayse"=="Ayse");//true
		
		System.out.println(!(3<4));//false
		
		System.out.println(!((3<4 && "Ayse"=="Ayse" ) || 3.4>2.1));//false

	}
	

}
