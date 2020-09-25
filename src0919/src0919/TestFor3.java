public class TestFor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 6; i++) {		//打印6行
			for (int j = 1; j <= 6-i; j++) {
				System.out.print(" ");		//打印空格
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");		//打印*号
			}
			System.out.println();
		}
		
	}

}
