//����
public class Sort3Num {
	public static void main(String[] args) {
		int x = 8, y = 2, z = 5, t;
		// ��x��y�н�С��������x��
		if (x > y) {
			t = x;
			x = y;
			y = t;
		}
		// ��x��z�н�С��������x�У�����x�о���xyz��������С����
		if (x > z) {
			t = x;
			x = z;
			z = t;
		}
		// ��y��z�н�С��������y�У�����z�о���xyz������������
		if (y > z) {
			t = y;
			y = z;
			z = t;
		}
		System.out.println("��������Ϊ " + x + " " + y + " " + z);
	}
}