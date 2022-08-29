package Operator;

class Objmethod1{
	
	String name;
	int age;
	void input(String n,int a) { // insert records method1
		
		age=a;
		name=n;
		
	}void display() { // method2 display result
		System.out.println(name+" "+age);
	}

}
 class Objmethod {
	    //main method
		public static void main(String[] args) {
		// INITIALIZED OJECT BY REFERENCE
			Objmethod1 obr =new Objmethod1(); // here obr is reference variable
			Objmethod1 obr1 =new Objmethod1();
			
			obr.input("ranojoy",24);
			obr1.input("srikanta",26);
			
			//print it
		    obr.display();
		    obr1.display();
		}

	}
	