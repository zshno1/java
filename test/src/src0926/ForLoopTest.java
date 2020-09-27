package ch02;
public class ForLoopTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 100; i < 1000; i++) {
			//获取各个位上的数？？
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 10 / 10 % 10;
			System.out.println(bai+"//"+shi+"//"+ge);
			if (i == (ge * ge * ge + shi * shi * shi + bai * bai * bai)) {
				System.out.println("水仙花数是：" + bai + "" + shi + "" + ge);
				count++;
			}
		}
		System.out.println("水仙花数共有" + count + "个");
	}
}
