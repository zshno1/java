package chapter2.e07;

public class BitwiseOperatorTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// λ��&
		int a = 15; // a���ڶ���������00001111
		int b = 6; // b���ڶ���������00000110
		System.out.println("λ��&  : " + (a & b));// ���ڶ���������00000110
		
		// ����<<
		int a1 = 15;
		int b1 = 2;
		int c1 = a << b1;// ����00111100��
		System.out.println("����" + c1);
		
		// ����>>
		int a2 = 15;
		int b2 = 2;
		int c2 = a >> b2;// ����00111100��
		System.out.println("����>>: " + c2);
		
		// ������ ~
		int a3 = 15;// 00010110;
		int c3 = ~a3;
		System.out.println("������ ~ ��  " + c3);
		
		// �������
		int a4 = 15;
		int b4 = 2;
		System.out.println("������� :  " + (a4 ^ b4));
	
		// >>>�޷�������
		int a5 = -1;
		int b5 = a5 >>> 1;
		System.out.println(">>>�޷�������: " + b5);
	}
}
