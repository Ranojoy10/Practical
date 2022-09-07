package Operator;

 class Vehicle { // parent class A
	void running()
	{
		System.out.println("running mode on");	
    } 
	}
	class Bike extends Vehicle { // child class B
	
	void run()
	{
		System.out.println("running speed mode on");	
    }
	}
	
	class Vehicle2 {
	
	public static void main(String[] args) {
	Bike d= new Bike();	// object of child class bike
    d.run();
	d.running(); // parent class method
	}
}



