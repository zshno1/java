package ch02;
import java.util.Scanner;
public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���Ŀ��Գɼ�Ϊ��");
		int score = sc.nextInt();
		int a = score/10;  //??
		System.out.println(a);
		switch(a){
		case 10: 
			System.out.println("������");
//			break;
		case 9:  
			System.out.println("�ɼ������");
//			break;
		case 8:
			System.out.println("�ɼ�����");
//			break;
		case 7:
			System.out.println("�ɼ����ã�");
//			break;
		case 6:
			System.out.println("�ɼ�����");
//			break;
		default:
			System.out.println("�ɼ�������");
		}
	}
}
