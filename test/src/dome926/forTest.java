package dome926;

public class forTest {
	public static void main(String[] ags) {
//		break/continue语句练习；计算1^2+2^2+3^2+...+i^2...，结果大于5000时停止计算，输出结果和对应的i值。
		int i , k = 0;
		for (i = 0;  ; i++) {
			if(k > 5000) {
				break;
			}
			k = k + i * i;
		}
		System.out.println(k + "//" + i);
		
		for(int j =0; j < 10; j++) {
			if(j == 2) {
				continue;
			}
			System.out.println(j);
		}

//		245张省会
//		图案打印  245张省会
		for (int n =1; n < 6; n++) {
			for(int m = 1 ; m <= n *2-1 ; m++){
				System.out.print("*");
			}
			System.out.println();
		}	
		
		System.out.println("另一个图案");

		for (int n =5; n > 0; n--) {
			for(int m = 1 ; m <= n *2-1 ; m++){
				System.out.print("*");
			}
			System.out.println();
		}	
		
//		for (int n =5; n > 0; n--) {
//			for(int m = 1 ; m <= n *2-1 ; m++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}	
		
		
		
	}
}
