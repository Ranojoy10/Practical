package Operator;

public class Thiskeyword2 {

        int rollno;
        String name;
        float fee;
        // constructor
        Thiskeyword2(int rollno, String name, float fee) {
        	rollno=rollno;
        	name=name;
        	fee=fee;
        }
        // method
        void display() {
        	System.out.println(rollno+" "+name+" "+fee);
        }
        public class Test { // inner class 2     
        public static void main(String[] args) {
        	//objects
        	Thiskeyword2 s1=new Thiskeyword2(10,"Ranojoy",50000);
        	Thiskeyword2 s2=new Thiskeyword2(100,"Amit",70000);
        	s1.display();
        	s2.display();
        }
        }}