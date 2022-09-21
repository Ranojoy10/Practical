package Operator;

 class RuntimePoly {
void show() {
	System.out.println("show anything");
}
 }
 class test extends RuntimePoly {
	 void show() {
			System.out.println("show nothing");
		}
	public static void main(String[] args) {
		RuntimePoly t=new RuntimePoly();
		t.show();
	}
}
