package Operator;

import java.util.Scanner;

public class AdditionbyUserdefinedmethod {
	
		public static void main(String[] args) {
			// create scanner class object
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the first number:");
			// Taking first input from the user 
			int a=sc.nextInt();
			// create scanner class object
			Scanner st= new Scanner(System.in);
			System.out.println("Enter the second number:");
			// Taking second input from the user
			int b=st.nextInt();
			// method
			Additionoftwonumber(a,b); // calling method
		}
		// user defined method
		public static void Additionoftwonumber(int a,int b) {
			// method body 
			int num=(a+b);  // logic
				System.out.println(" Addition of two numbers is:"+num);// printing result
			
	}
	}