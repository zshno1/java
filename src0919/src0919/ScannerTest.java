package p1;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("������һ������");
		int a = scanner.nextInt();
		System.out.printf("%d��ƽ����%d\n", a, a * a);
		scanner.close();
	}
}