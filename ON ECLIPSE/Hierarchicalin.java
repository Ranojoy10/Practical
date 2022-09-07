package Operator;
 //HIERARCHICAL INHERITANCE
 class Vehicle1 { // parent class A
	void running()
	{
		System.out.println("running mode on");	
    } 
	}
	class Car1 extends Vehicle1 { // child class B
	    void run()
	   {
		System.out.println(" Car run mode on");	
       }
	  }
	
     class Bike1 extends Vehicle1 {  // child class c
    	 void Speed()
  	   {
  		System.out.println(" Bike speed is very high");	
         }
     }
	
public class Hierarchicalin {

	public static void main(String[] args) {
		Bike1 b= new Bike1();	
	    b.running();
		b.Speed(); 
		Car1 c= new Car1();
		c.running();
		c.run();	
	}
}
