package ch02;
import java.util.Scanner;
public class IfTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�������������֣�");
		int a = scan.nextInt();
		if (a > 0 & a < 100) {
			System.out.println(a + ">0&" + a + "<100");
		} else if (a < 500) {
			System.out.println(a + "<500");
		} else {
			System.out.println(a + "�Ǹ�����");
		}
//		scan.close();
	}
}
