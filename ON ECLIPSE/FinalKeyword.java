package Operator;


 class FinalKeyword {// parent class
	final int a=50;
	//final method
	final void method() {
//	int	a=70;
	System.out.println("a");
	}}
	class abcd extends FinalKeyword{// we cannot extend the final class
	// we cannot override the final method	
void method1() {//compilation error,child class method
	System.out.println("anything");
}
public static void main(String[] args) {
	FinalKeyword fk=new FinalKeyword();
	fk.method();
	
}
}