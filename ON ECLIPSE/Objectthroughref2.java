package Operator;

public class Objectthroughref2 {

		// field
		int age;
		String name;
		
		
		
	    //main method
		public static void main(String[] args) {
		// INITIALIZED OJECT BY REFERENCE
			Objectthroughref2 obr =new Objectthroughref2(); // here obr is reference variable
			Objectthroughref2 obr1 =new Objectthroughref2();
			Objectthroughref2 obr2 =new Objectthroughref2();
			obr.age=24;
			obr.name = "RANOJOY";
			obr1.age=25;
			obr1.name = "JOYDEEP";
			obr2.age=24;
			obr2.name = "RANODEEP";
			
			//print it
			System.out.println(obr.age);
			System.out.println(obr.name);
			System.out.println(obr.age+" "+obr.name);
			System.out.println(obr1.age+" "+obr1.name);
			System.out.println(obr2.age+" "+obr2.name);
		}

	}
	