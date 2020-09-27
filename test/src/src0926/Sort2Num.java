//比较大小
public class Sort2Num {
	public static void main(String[] args) {
		double x = 8.3, y = 4.5, t;
		// 将x和y中较大的数赋给t
		if (x > y)
			t = x;
		else
			t = y;
		System.out.println("较大数是" + t);
	}
}