package com.pack1;

import java.util.Scanner;

public class Test01 {

	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the first integer :");
			int first = sc.nextInt();
			System.out.println("Enter the Second integer :");
			int second = sc.nextInt();
			
			System.out.println("Enter the Floating-point number :");
			float f = sc.nextFloat();
			
			System.out.println("Enter the single character :");
			char character = sc.next().charAt(0);
			
			System.out.println("Enter the boolean value(true/false):");
			boolean bv = sc.nextBoolean();
			
			//sc.nextLine();
			System.out.println("Enter Your Name:");
			String name = sc.next();
			int sum = first+second;
			int difference = first - second;
			int product = first*second;
			
			float f1 = f*2;
			char nextChar=(char)(character+1);
			System.out.println(nextChar);
			boolean opposite = !bv;
			
			
			System.out.println("Sum of  " + first +" and "+ second + " is : "+ sum  );
			System.out.println("Difference of " + first +" and "+ second + " is : "+ difference  );
			System.out.println("Product of " + first +" and "+ second + " is : "+ product  );
			System.out.println(f + "multiplayed by 2 is : "+f1);
			System.out.println("The next Character after " + character + " is: " +nextChar);
			System.out.println("The opposite of " +bv+" is : "+opposite);
			System.out.println("Hello," + name +"!");

		}

	}


