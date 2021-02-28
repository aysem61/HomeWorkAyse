package Scanner_Variables_Increment;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		circle();
		
		triangle();		
		
		way();	
		
		hour();
		
	}
	
	
	public static void  circle() {
		/*)Type a program which calculates the area and the perimeter of a circle
			whose radius is entered by user. (Use float)
			Hint 1: Take pi number as 3.14159
			Hint 2: Area of a circle is 3.14159 x radius x radius
			Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
			Hint 4: To get float, use nextFloat()
			Pinned by Suleyman Alptekin
		 * 
		 */
		
		System.out.println("please enter the radios of circle ");
		
		 Scanner rad=new Scanner (System.in);
		 
		 float pi=3.14159f;
		 
		 float cir=rad.nextFloat();
		 
		 
		 System.out.println("area of circle : "+cir*cir*pi);
		 
		 System.out.println("perimeter of circle : "+(2*pi)*cir);
		
		
		
	}
	
	
	public static void triangle() {
		/*2)Type a program which calculates the perimeter of a triangle whose
				Side lengths are entered by user. (Use byte)
				Hint 1: Perimeter of a triangle is a + b + c
				Hint 4: To get byte, use nextByte()
				Pinned by Suleyman Alptekin
		 * 
		 */
			//System.out.println("Please enter the side length");
			
			
		
			Scanner side=new Scanner(System.in);
			
			System.out.println("Please enter the side of the first length ");
			byte a=side.nextByte();
			
			
			
			System.out.println("Please enter the side of the second length");
			byte b=side.nextByte();
			
			
			System.out.println("Please enter the side of the third length");
			byte c=side.nextByte();
			
			
			System.out.println("Perimeter :"+ (a+b+c));
					
	}		
			 
	public static void way() { 
		
		
		/*3)Type a program which converts the mile to kilometer. Mile value will be
				entered by user. (Use double)
				Hint 1: km = mile x 1.6
				Hint 2: To get double, use nextDouble()
			
		 */
		System.out.println("Please enter the mile");		
		
		Scanner mile=new Scanner(System.in);
		
		double way=mile.nextDouble();
		
		double sbt=1.6;
		
		System.out.println("km:"+(way*sbt));
	
	}
	 public static void hour() {
		 
		 /*4)Type a program which converts the hours to seconds. Hours value will be
					entered by user. (Use long)
					Hint 1: second = hour x 60 x 60
					Hint 2: To get long, use nextLong()
		  
		  }
		  
		  */
		 
		 System.out.println("Plesae enter the hour");
		 
		 Scanner hour=new Scanner(System.in);
		 
		 long h=hour.nextLong();
 		 
		// Scanner minute=new Scanner(System.in);
		 int minute=60;
		 
		 int secon=60;
		 
		 System.out.println("h:"+(h*minute*secon));
		
		
	}
	
}	
		
	
		
		
	
	


