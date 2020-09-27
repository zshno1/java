package ch02;
import java.util.Scanner;
public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("您的考试成绩为：");
		int score = sc.nextInt();
		int a = score/10;  //??
		System.out.println(a);
		switch(a){
		case 10: 
			System.out.println("完美！");
//			break;
		case 9:  
			System.out.println("成绩真棒！");
//			break;
		case 8:
			System.out.println("成绩优秀");
//			break;
		case 7:
			System.out.println("成绩良好！");
//			break;
		case 6:
			System.out.println("成绩及格！");
//			break;
		default:
			System.out.println("成绩不及格！");
		}
	}
}
