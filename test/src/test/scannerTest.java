package test;
import java.util.Scanner; 

public class scannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("������һ������:");
		int a = scanner.nextInt();
		System.out.printf("%d��ƽ����%d\n",a,a*a);
		scanner.close();
	}
}

