package chapter2.e03;

/**
 * @author Administrator
 * @time ����ʱ�䣺2018��2��10�� ����1:27:57
 * 
 */
public class EscapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��.���ָ���
		System.out.println("��.���ָ���");
		String[] str1 = "a.b".split("\\.");
		for (int i = 0; i < str1.length; i++) {
			System.out.println("str[" + i + "]=" + str1[i]);
		}
		// ��|���ָ���
		System.out.println("��|���ָ���");
		String[] str2 = "aa|bb".split("\\|");
		for (int i = 0; i < str2.length; i++) {
			System.out.println("str[" + i + "]=" + str2[i]);
		}
		// ��*���ָ���
		System.out.println("��*���ָ���");
		String[] str3 = "aaa*bbb*ccc".split("\\*");
		for (int i = 0; i < str3.length; i++) {
			System.out.println("str3[" + i + "]=" + str3[i]);
		}
		// ��\���ָ���
		// "aaa\bbb\ccc" �ķָ�����
		// "aaa\bbb\ccc" ����ȷ��ʾ������"aaaa\\bbbb\\cccc"
		System.out.println("��\\���ָ���");
		String[] str4 = "aaaa\\bbbb\\cccc".split("\\\\");
		for (int i = 0; i < str4.length; i++) {
			System.out.println("str4[" + i + "]=" + str4[i]);
		}
		// ����ָ���
		System.out.println("����ָ���");
		String[] str5 = "acount=? and uu =? or n=?".split("and|or");
		for (int i = 0; i < str5.length; i++) {
			System.out.println("str5[" + i + "]=" + str5[i]);
		}
	}

}
