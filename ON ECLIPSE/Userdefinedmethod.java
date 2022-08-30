package Operator;

import java.util.Scanner;

public class Userdefinedmethod {

	public static void main(String[] args) {
		// create scanner class object
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		// Taking input from user
		int num=sc.nextInt();
		// method
		checkEvenodd(num);
	}
	// user defined method
	public static void checkEvenodd(int num) {
		// method body
		if(num%2==0)
			System.out.println(num +"is Even number");
		else
			System.out.println(num +"is odd number");
}
}
