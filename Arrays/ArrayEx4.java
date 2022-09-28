package Operator;
// anonymous Array in java
public class ArrayEx4 {

	public static void main(String[] args) {
		display(new int[]  {10,30,60,70,80});}// passing anonymous Array 
	// Creating an method which receives an array as a parameter
	static void display (int arr[]) { // no need to declare the array while passing an array to the method.
		for(int i=0;i<arr.length-1;i++)
			System.out.println(arr[i]);
	}

}