package p1;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int price;
		int amount;
		System.out.println("请输入商品价格：");
		price = in.nextInt();
		System.out.println("请输入面值：");
		amount = in.nextInt();
//		in.close();
		System.out.print("总金额为：" + amount + "元；商品价格为：" + price);
		System.out.println("元；找零：" + (amount - price) + "元。");
	}

}
