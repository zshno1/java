package ch02;
public class ForLoopTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 100; i < 1000; i++) {
			//��ȡ����λ�ϵ�������
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 10 / 10 % 10;
			System.out.println(bai+"//"+shi+"//"+ge);
			if (i == (ge * ge * ge + shi * shi * shi + bai * bai * bai)) {
				System.out.println("ˮ�ɻ����ǣ�" + bai + "" + shi + "" + ge);
				count++;
			}
		}
		System.out.println("ˮ�ɻ�������" + count + "��");
	}
}
