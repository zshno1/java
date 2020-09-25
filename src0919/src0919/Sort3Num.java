//排序
public class Sort3Num {
	public static void main(String[] args) {
		int x = 8, y = 2, z = 5, t;
		// 将x和y中较小的数放在x中
		if (x > y) {
			t = x;
			x = y;
			y = t;
		}
		// 将x和z中较小的数放在x中，这样x中就是xyz三者中最小的数
		if (x > z) {
			t = x;
			x = z;
			z = t;
		}
		// 将y和z中较小的数放在y中，这样z中就是xyz三者中最大的数
		if (y > z) {
			t = y;
			y = z;
			z = t;
		}
		System.out.println("排序后的数为 " + x + " " + y + " " + z);
	}
}