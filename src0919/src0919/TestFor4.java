import java.util.Scanner;

public class TestFor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������");
		int num = sc.nextInt();
		int result = 1;
		sc.close();
		for (int i = 1; i <= num; i = i*10) {
			result = result * ( num / i%10 );
		}
		System.out.println(num + "��λ���ĳ˻�Ϊ��" +result);
	}

}
