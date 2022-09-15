package Operator;

class 	Exam {
	int marks() {
		return 0;
	}
}

class comp extends	Exam {
	int marks() {
		return 80;
	}
}

class math extends	Exam {
	int marks() {
		return 90;
	}
}

class science extends Exam {
	int marks() {
		return 70;
	}
}

class english extends Exam {
	int marks() {
		return 78;
	}
}
public class Overriddingeg {

	public static void main(String[] args) {
		comp c = new comp();
		math m=new math();
		science	s=new science();
		english e=new english();
		System.out.println("Computer marks is:"+c.marks());
		System.out.println("Math marks is:"+m.marks());
		s.marks();
		e.marks();
	}

}
