package Operator;
// Display default value
public class Defaultconstructor {

  int age;
  String name;
  void show()  { // method to display age and name
  System.out.println(age+ " " +name);}
	public static void main(String[] args) {
		Defaultconstructor d=new Defaultconstructor();
		Defaultconstructor d1=new Defaultconstructor();
		d.show();
		d1.show();
	
	}
	Defaultconstructor(){
    System.out.println("constructor is created");
	}

	}
