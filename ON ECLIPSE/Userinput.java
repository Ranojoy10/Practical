package Operator;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args)
	
	{  
		// creating scanner class
	   Scanner sc = new Scanner (System.in); // System.in is a standard input stream
	   System.out.print("Enter first number -   ");
	   int  a = sc.nextInt();
	   System.out.print("Enter second number -   ");
	   int  b = sc.nextInt();
	   System.out.print("Enter Third number -   ");
	   int  c = sc.nextInt();
	   int  d = a+b+c;
	   System.out.println (" Total=" +d);
	}

}
