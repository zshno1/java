package test;
import java.util.Scanner;
public class dome0926 {
	public static void main( String[] ags) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("请输入以下数字:");
//		int a = scan.nextInt();
//		if (a > 0 & a < 100) {
//			System.out.println(a +">0&" + a + "<100");
//		} else if (a < 500) {
//			System.out.println(a + "<500");
//		} else {
//			System.out.println(a + "是个大数");
//		}
		
//		成绩分数判断 245张省会
		Scanner sc = new Scanner(System.in);
		System.out.print("您的考试成绩为:");
//		分数范围
		int score= sc.nextInt();
		if (score > 100) {
			System.out.println("输入成绩有误");
		} else {
			int num = score / 10;
//			System.out.println(num);
			switch(num) {
			case 10:
				System.out.println("完美！");
				break;
			case 9 :
				System.out.println("成绩真棒！");
				break;
			case 8:
				System.out.println("成绩优秀！");
				break;
			case 7:
				System.out.println("成绩良好！");
				break;
			case 6:
				System.out.println("成绩及格");
				break;
			default:
				System.out.println("成绩不及格！");
				
			}
		}
		
		
//		根据手机号前三位判断运营商 136 137 138 139 移动130 131 133 电信 186 188联通 其他输出未知运营商
		Scanner scTel  = new Scanner(System.in);
		System.out.print("请输入手机号:");
		long tel = scTel.nextLong();
		int tel3 =  (int)  (tel / 100000000);
		System.out.println(tel3);
		int telLength= String.valueOf(tel).length();
		
		if(telLength != 11) {
			System.out.print("手机号格式错误");
			return ;
		}
		switch(tel3) {
		case 136:
		case 137:
		case 138:
		case 139:
			System.out.println("移动");
			break;
		case 130 :
		case 131 :
		case 132 :
			System.out.println("电信");
			break;
		case 186 :
		case 188:
			System.out.println("联通");
			break;
		default:
			System.out.println("未知运营商");
		}
		
		System.out.println("245张省会0926课堂作业");
		
////		水仙花数
//		int count = 0;
//		for (int i = 100; i < 1000; i++ ) {
////			获取各个位上的数
//			int ge = i%10;
//			int shi = i /10%10;
//			int bai = i/10/10%10;
////			System.out.println(bai + "//"+ shi + "//" + ge);
//			if( i == (ge*ge*ge + shi*shi*shi+bai*bai*bai)) {
//				System.out.println("水仙花数是：" +i );
//				count++;
//				
//			}
//		}
//		System.out.println("水仙花数共有" + count + "个");
			
	}
}













