import java.util.Scanner;
public class Ranking {
	public static void main(String args[]) {
		int score;
		//score=78;
		Scanner sc=new Scanner(System.in);
		score=sc.nextInt();
		// int score = (int) (Math.random() * 100); // ����һ��[0,100]����������
		if (0 <= score && score <= 59)
			System.out.println("�ɼ�Ϊ" + score + "�֣�����Ϊ������");
		else if (60 <= score && score <= 69)
			System.out.println("�ɼ�Ϊ" + score + "�֣�����Ϊ����");
		else if (70 <= score && score <= 79)
			System.out.println("�ɼ�Ϊ" + score + "�֣�����Ϊ�е�");
		else if (80 <= score && score <= 89)
			System.out.println("�ɼ�Ϊ" + score + "�֣�����Ϊ����");
		else if (90 <= score && score <= 100)
			System.out.println("�ɼ�Ϊ" + score + "�֣�����Ϊ����");
	}
}
