import java.io.*;
import java.util.*;
class ContinueDemo {
	public static void main(String[] args) {
		int data;
		Scanner in = new Scanner(System.in);
		System.out.print("������һ��������");
		while (true) {
			data = in.nextInt();
			if (data == 0)
				break;
			else if (data > 0)
				continue;
			else
				System.out.println(data);
		}
	}
}
