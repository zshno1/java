import java.util.Scanner;

public class TestIf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	//输入身高
		double height = sc.nextDouble();		//从控制台获得身高值	
		if (height < 160) {
			System.out.println("160以下身高对应的衣服尺码为s");
		}
		else if (height < 165) {
			System.out.println("160~165对应的衣服尺码为m");
		}
		else if (height < 170) {
			System.out.println("165~170对应的衣服尺码为l");
		}
		else if (height < 175) {
			System.out.println("170~175对应的衣服尺码为xl");
		}
		else if (height >= 175) {
			System.out.println("175y以上对应的衣服尺码为xxl");
		}
		sc.close();
	}
}
