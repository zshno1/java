import java.util.Scanner;
public class Ranking {
	public static void main(String args[]) {
		int score;
		//score=78;
		Scanner sc=new Scanner(System.in);
		score=sc.nextInt();
		// int score = (int) (Math.random() * 100); // 产生一个[0,100]间的随机整数
		if (0 <= score && score <= 59)
			System.out.println("成绩为" + score + "分，评定为不及格");
		else if (60 <= score && score <= 69)
			System.out.println("成绩为" + score + "分，评定为及格");
		else if (70 <= score && score <= 79)
			System.out.println("成绩为" + score + "分，评定为中等");
		else if (80 <= score && score <= 89)
			System.out.println("成绩为" + score + "分，评定为良好");
		else if (90 <= score && score <= 100)
			System.out.println("成绩为" + score + "分，评定为优秀");
	}
}
