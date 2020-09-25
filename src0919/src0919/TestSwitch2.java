import java.util.Scanner;

public class TestSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入手机号：");
		long telNum = sc.nextLong();
		int tel = (int)(telNum / 100000000);
		switch (tel) {
		case 138:
//		case 136:
//		case 139:
			System.out.println("中国移动");
			break;
		case 133:
			System.out.println("中国电信");			
			break;
		case 186:
			System.out.println("中国联通");			
			break;
		default:
			break;
		}
		sc.close();
	}
	

}
