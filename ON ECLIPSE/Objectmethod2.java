package Operator;

class Object{
	
	String name;
	int age;
	void input(String n,int a) { // insert records method1
		
		age=a;
		name=n;
		
	}void display() { // method2 display result
		System.out.println(name+" "+age);
	}
}

 class Objectmethod2 {

	public static void main(String[] args) {
		// INITIALIZED OJECT BY REFERENCE
					Object obr =new Object(); // here obr is reference variable
					Object obr1 =new Object();
					
					obr.input("ranojoy",24);
					obr1.input("srikanta",26);
					
					//print it
				    obr.display();
				    obr1.display();
				}

			}

	
