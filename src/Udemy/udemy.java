package Udemy;

import java.util.Scanner;

public class udemy {
	
	static Scanner scan=new Scanner(System.in);
	
	
	public static void main(String[] args) {
	 
	
		 ucgeninHipotenus(); 		
		
	int a=3;
		
	
	a+=2;
	System.out.println(a);
	
	a--;
	System.out.println(a);
	
	a*=2;
	System.out.println(a);
	
	a-=1;
	System.out.println(a);
	
	a=-1;
	System.out.println(a);
	
	a=2;
	System.out.println(a);
	
	//Find the user's body mass index according to the height and weight values you get from the user.
	//body mass index: kilo / height(m)*height(m)
	 

		
		
		System.out.println("Please enter your weigth");
	    int weigth=scan.nextInt();
	    
	    System.out.println("Please enter your heigth:(Example:1,72)");
	    double heigth=scan.nextDouble();
	    
	    System.out.println("body mass index:" +(weigth/(heigth*heigth)));
	    
	    //get information about how much a vehicle burns per kilometer and how many kilometers it has made, and calculate how much the driver should say in total.
	    
	    System.out.println("how many drys your vehicle burns per kilomete(Example:0,32)");
	    
	    double drys=scan.nextDouble();
	    
	    System.out.println("how many kilometers you've gone with your vehicle");
	    
	    int km=scan.nextInt();
	    
	    System.out.println("How many is total? :"+ (drys*km));
	    
	    //change the values of the two numberes you receive from the user.
	    
	    int first;
	    int second;
	    
	    System.out.println("first:");
	    first=scan.nextInt();
	    
	    System.out.println("second");
	    second=scan.nextInt();
	    System.out.println("before it is change:");
	    
	    System.out.println("first:"+first+"second:"+second);
	    
	     int gecici=first;
	     first=second;
	     second=gecici;
	     System.out.println("after change:");
	     
	  
	  
	     forloop();   
	  
	}

	private static void ucgeninHipotenus() {
		// TODO Auto-generated method stub
		
		//dik ucgenin hipotenusunu bulun.
	     
	     int b;
	     
	     int c;
	     
	     System.out.println("first edge1");
	     b=scan.nextInt();
	     
	     System.out.println("second edge2");
	     c=scan.nextInt();
	     
	     double h=Math.sqrt(b*b+c*c);
	    		 
	     
	    
	     System.out.println("hipotenus : "+h);
		
	}

	private static void forloop() {
		
		//ic ice for dongusu ile carpim tablosu
		
		for(int i=1; i<=10; i++ ) {
			
			System.out.println("************************************************");
			
			for(int j=1; j<=10; j++) {
				
				System.out.println(i+"x"+j+"="+(i*j));
			}
			
			System.out.println("******************************************************");
		}
		
		
	}
	    
		
	
		 
		
		 
		 
	
	

		 
		 
		 
		 
		
	 

	}


