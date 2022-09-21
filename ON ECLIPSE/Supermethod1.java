package Operator;

class Testing{
	void method() {
   	 System.out.println("Sohel");
    }
}

 class Supermethod1 extends Testing {
         void method() {
        	 System.out.println("Bujhte perecho?");
        	 super.method();
         }
	public static void main(String[] args) {
		Supermethod1 T=new Supermethod1();
		T.method();

	}

}
