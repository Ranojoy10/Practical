package Operator;

//runtime polymorphism
class zebra1{
	int a=10;
	void bark(){
	System.out.println("barking");
	}
	}
class Ceetah extends zebra1{
	int a=20;
	void bark(){
	System.out.println("firse roar");
	}
	}
class Tiger extends zebra1{
	void bark(){
	System.out.println("Roar");
	}
	}
public class Zoo2 {

	public static void main(String[] args) {
//reference variable of parent class with child class object
		zebra1 Z;
		Z=new Ceetah();
		Z.bark();
		System.out.println(Z.a);
		Z=new Tiger();
		Z.bark();
		Z=new zebra1();
		Z.bark();
	}

}