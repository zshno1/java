import java.util.Scanner;

public class TestFor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num = sc.nextInt();
		int result = 1;
		sc.close();
		for (int i = 1; i <= num; i = i*10) {
			result = result * ( num / i%10 );
		}
		System.out.println(num + "各位数的乘积为：" +result);
	}

}
