package test;
import java.util.Scanner; 
public class index {
	public static void main(String[] args) {
//		2、分别定义int、short、float、double类型的变量，并赋值输出。
		int n = 12;
		short m = 1;
		float k = 2.5F;
		double j = 3.35; 
		
		System.out.print("int n =" + n + '\n');
		System.out.print("int m =" + m + '\n');
		System.out.print("int k =" + k + '\n');
		System.out.print("int j =" + j + '\n');
		System.out.print('\n');
//		3、编写程序计算1到100的累加和。求和
        int i;
        int sum = 0;
        for(i = 1; i <= 100; i++) {
        	sum += i;
        }
        System.out.print("1到100的累加和=" + sum + '\n');
        
      //4、1摄氏度(℃)=33.8华氏度(℉)，实现二者之间的转换(输入温度数值，输出转换结果)。
        //      华氏度=摄氏度×9÷5＋32
        Scanner scanner = new Scanner(System.in);
		System.out.printf("请输入摄氏度(℃):");
		int C = scanner.nextInt();
//		float dd= 33.8f;
		float F = C * 9 /5 + 32; 
		System.out.printf("%d摄氏度(℃)等于%f华氏度\n",C,  F);
		scanner.close();
        
      //5、使用三目运算实现比较2个数的大小，并将小的数加20输出
		int x = 3 , y =5;
		int min = x < y ? x : y;
		min = min + 20;
		System.out.println("最小值+20的结果为：" + min);
    }
}
