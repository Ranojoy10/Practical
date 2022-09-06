package Operator;


 class Staticvariable2 { // class 1
        int rollno;
        String name;
        float fee;
        static String college="SRM";
        // CONSTRUCTOR
        Staticvariable2(int rollno,String name,float fee) {
         this.rollno=rollno;
        this.name=name;
        this.fee=fee;
	}
         // method
        void display() {
        	System.out.println(rollno+" "+name+" "+fee+" "+college);
        }
          class Staticvariable { // class 2
        	 public static void main (String[]args) {
        		 // objects
        		 Staticvariable2 s1=new Staticvariable2(111,"PALLAVI",5000);
        		 Staticvariable2 s2=new Staticvariable2(555,"AMIT",6000);
        		 s1.display();
        		 s2.display();
        	 }
         }
}