package Operator;

// parent class
class Shape1 {
	void print() { //parent class method
		System.out.println("print circle");
	}
}
class Size3 extends Shape { //child class
	void print() { //child class method
		System.out.println("print triangle");
	}
}

public class SuperMETHOD {

	public static void main(String[] args) {
		Size3 obj= new Size3();
		obj.print();
	}

}
