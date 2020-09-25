public class SelfAddOperationSample {	
	public static void main(String[] args) {		
		int x = 3;
		int temp = 0;
		temp = x;
		System.out.println("++x = " + (++x));
		System.out.println(" x = " + x);
		x = temp;
		System.out.println("x++ = " + (x++));
		System.out.println(" x = " + x);
	}
}
