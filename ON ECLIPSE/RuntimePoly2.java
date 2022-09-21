package Operator;

class RuntimePoly2 {
void show() {
	System.out.println("show anything");
}
 }
 class bcd extends RuntimePoly2 {
	 void show() {
			System.out.println("show nothing");
		}
	public static void main(String[] args) {
		RuntimePoly2 t=new bcd();
		t.show();
	}
}