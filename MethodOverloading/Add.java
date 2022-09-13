package MethodOverloading;

// Method overloading : changing number of argument

public class Add { // class
	
	static int add(int a,int b)  // no. of argument 2 add is a method
	{	
		 return(a+b);
	}
	
	static int add(int a, int b , int c) // no. of argument 2 add is a method
	{
		return(a+b+c);
	}
 
	class overloading{ // main class
	public static void main(String[] args) {
		
        System.out.println(Add.add(10,20));
        System.out.println(Add.add(45,30,12));
	}

  }
	
}
