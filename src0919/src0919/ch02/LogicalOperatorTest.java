package chapter2.e06;

public class LogicalOperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��·||
		int i0 = 0;
		int j0 = 0;
		if (++i0 > 0 || ++j0 > 0) {
			System.out.println("��·|| i0��ֵ:" + i0);
			System.out.println("��·|| j0��ֵ:" + j0);
		}
		// ��·&&
		int i1 = 0;
		int j1 = 0;
		if (!(++i1 < 0 && ++j1 > 0)) {
			System.out.println("��·&& i1��ֵ:" + i1);
			System.out.println("��·&& j1��ֵ:" + j1);
		}
		// �Ƕ�·|��ÿ�����ֶ��μ�����
		int i2 = 0;
		int j2 = 0;
		if (++i2 > 0 | ++j2 > 0) {
			System.out.println("�Ƕ�·| i2��ֵ:" + i2);
			System.out.println("�Ƕ�·| j2��ֵ:" + j2);
		}
		// �Ƕ�·&��ÿ�����ֶ��μ�����
		int i3 = 0;
		int j3 = 0;
		if (!(++i3 < 0 & ++j3 > 0)) {
			System.out.println("�Ƕ�·& i3��ֵ:" + i3);
			System.out.println("�Ƕ�·& j3��ֵ:" + j3);
		}
	}

}
