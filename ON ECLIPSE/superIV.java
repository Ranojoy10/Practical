package Operator;

// parent class
class Shape {
	String name="circle"; //  data member of parent class
}

class Size extends Shape { // child class
	String name="Triangle"; // data member of child class
	void displayname( ) { //method
		System.out.println(name); // display the name of the size class
		System.out.println(super.name); // display the name of the Shape class
	}
}
public class superIV {

	public static void main(String[] args) {
		Size obj=new Size();
		obj.displayname();

	}

}
