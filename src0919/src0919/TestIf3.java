import java.util.Scanner;

public class TestIf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	//�������
		double height = sc.nextDouble();		//�ӿ���̨������ֵ	
		if (height < 160) {
			System.out.println("160������߶�Ӧ���·�����Ϊs");
		}
		else if (height < 165) {
			System.out.println("160~165��Ӧ���·�����Ϊm");
		}
		else if (height < 170) {
			System.out.println("165~170��Ӧ���·�����Ϊl");
		}
		else if (height < 175) {
			System.out.println("170~175��Ӧ���·�����Ϊxl");
		}
		else if (height >= 175) {
			System.out.println("175y���϶�Ӧ���·�����Ϊxxl");
		}
		sc.close();
	}
}
