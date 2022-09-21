package Operator;

//runtime polymorphism
class zoo1{
	void bark(){
	System.out.println("barking");
	}
	}
class Cat extends zoo1{
	void bark(){
	System.out.println("meow");
	}
	}
class Dog extends zoo1{
	void bark(){
	System.out.println("baff");
	}
	}
public class Zoo {

	public static void main(String[] args) {
// reference variable of parent class with child class object
		zoo1 Z;
		Z=new Cat();
		Z.bark();
		Z=new Dog();
		Z.bark();
	}

}
