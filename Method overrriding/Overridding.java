package Operator;

// creating parent class

public class Overridding {

		void run() {
			System.out.println("running mode on");
		}
		}
		// Creating child class
		class Testoverridding extends Overridding {
			// defining same name method as its declared in the parent class
			void run() {
				System.out.println("running mode off");
			}
				public static void main (String args[]) {
					//
					Testoverridding obj= new Testoverridding();
					obj.run();
				}
			}
			
		
		


