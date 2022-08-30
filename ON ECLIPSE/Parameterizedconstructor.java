package Operator;
// Display default value
public class Parameterizedconstructor {

  int age;
  String name;
  Parameterizedconstructor(int a, String n) { // parameterized constructor where we have to pass the parameter
  age=a;
  name=n;
  }
       void show()  { // method to display age and name
       System.out.println(age+ " " +name);}
	   public static void main(String[] args) {
		Parameterizedconstructor d=new Parameterizedconstructor(60,"karan");
		Parameterizedconstructor d1=new Parameterizedconstructor(25,"Arjun");
		d.show();
		d1.show();
	
	}}