//数组，排序
import java.util.Scanner;
public class exchangeSort {
	public static void main(String[] args) {
		int i, j;
		int[] A = new int[5];
		System.out.println("please input the numbers:");
		Scanner sc = new Scanner(System.in);
		// 从键盘输入数据，为A数组赋值
		for (i = 0; i < A.length; i++) {
			System.out.println("A[" + i + "]=");
			A[i] = sc.nextInt();
		}
		sc.close();
		// 采用交换排序法对A数组排序
		for (i = 0; i < A.length - 1; i++) {
			for (j = i + 1; j < A.length; j++)
				if (A[i] > A[j]) {
					int t = A[i];
					A[i] = A[j];
					A[j] = t;
				}
		}
		System.out.println("The sorted numbers:");
		// 通过foreach循环输出排序后的数组
		for (int k : A)
			System.out.print(k + " ");
	}
}