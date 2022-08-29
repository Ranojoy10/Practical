package Operator;

public class Objectthroughref {

		// field
		int age;
		String name;
		
		
		
	    //main method
		public static void main(String[] args) {
		// INITIALIZED OJECT BY REFERENCE
			Objectthroughref obr =new Objectthroughref(); // here obr is reference variable
			obr.age=24;
			obr.name = "RANOJOY";
			
			//print it
			System.out.println(obr.age);
			System.out.println(obr.name);
			System.out.println(obr.age+" "+obr.name);
		}

	}
	