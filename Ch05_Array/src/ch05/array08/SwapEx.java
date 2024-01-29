
package ch05.array08;

public class SwapEx {
	public static void main(String[] args) {
		
		
		int a = 100;
		int b = 200;
		a = b;
		b = a;
		System.out.printf("a=%d. b =%d\n",a,b);
		
		int num0 = 10;
		int num1 = 20;
		int temp = 0;
		
		temp = num0;
		num0 = num1;
		num1 = temp;
		System.out.printf("num0=%d, num1=%d",num0,num1);
		
	}

}
