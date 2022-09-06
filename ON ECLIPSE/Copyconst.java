package Operator;

public class Copyconst {
		// Variable along with data type
		int age;
		String name;
		// Constructor & initialize
		Copyconst (int a, String n) {
			age=a;
			name=n;
		}
	      // copy con to initialize another obj
		Copyconst (Copyconst c) {
			age=c.age;
			name=c.name;
		}
            //method
		void show( ) {
			
			System.out.println(age+" "+name);
		}
		public static void main(String[] args) {
			Copyconst c1=new Copyconst(22,"Ranojoy");
			Copyconst c2=new Copyconst(c1);
			c1.show();
			c2.show();
		}
		}
	

