package Operator;

public class Nestedif {

	public static void main(String[] args) {
		String address ="Kolkata,India";
		
		if(address.endsWith("India")){ //true
			
			if(address.contains("Dunlop")) { //true 
				
				System.out.println("Your city is Dunlop"); // line 1 execute
			}
			
			else if(address.contains("Newtown")) {
				
				System.out.println("Your city is Newtown"); // line 2 execute
			}
			else { System.out.println(address.split(",")[0]); // Kolkata,India
				
			}
			} else System.out.println("You are not living in India");
		}
		}

	


