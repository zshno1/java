package p1;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int price;
		int amount;
		System.out.println("��������Ʒ�۸�");
		price = in.nextInt();
		System.out.println("��������ֵ��");
		amount = in.nextInt();
//		in.close();
		System.out.print("�ܽ��Ϊ��" + amount + "Ԫ����Ʒ�۸�Ϊ��" + price);
		System.out.println("Ԫ�����㣺" + (amount - price) + "Ԫ��");
	}

}
