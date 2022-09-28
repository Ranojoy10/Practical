// Find out the max number
package Operator;

public class ArrayExample {

	public static void main(String[] args) {
		int a[]= {10,30,60};
			System.out.println(largernumber(a));
	}
	public static int largernumber(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if (a[i]>max)
				max=a[i];
		}
		    return max;
	}

}
