class A

{
  static int c = 30; // static variable // with the help of classname dot variable
  int a = 10;      // Instance variable // obj create object 
  public static void main(String...args)   
{

   A obj = new A(); // creating object
   int b= 20;       // Local variable // directly
   System.out.println(A.c);
   System.out.println(b);
   System.out.println(obj.a);


}


}
