import java.util.Scanner;

public class TestSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ֻ��ţ�");
		long telNum = sc.nextLong();
		int tel = (int)(telNum / 100000000);
		switch (tel) {
		case 138:
//		case 136:
//		case 139:
			System.out.println("�й��ƶ�");
			break;
		case 133:
			System.out.println("�й�����");			
			break;
		case 186:
			System.out.println("�й���ͨ");			
			break;
		default:
			break;
		}
		sc.close();
	}
	

}
