package MethodOverloading;

// Method overloading : changing data type argument

public class Addition { // class
	
	static int add(int a,int b)  // no. of argument 2 add is a method
	{	
		 return(a+b);
	}
	
	static double add(double a,double b) // no. of argument 2 add is a method
	{
		return(a+b);
	}
 
	class overloading{ // main class
	public static void main(String[] args) {
		
        System.out.println(Addition.add(10,20));
        System.out.println(Addition.add(10.6,20.5));
	}

  }
	
}
