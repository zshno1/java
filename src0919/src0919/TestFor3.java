public class TestFor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 6; i++) {		//��ӡ6��
			for (int j = 1; j <= 6-i; j++) {
				System.out.print(" ");		//��ӡ�ո�
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");		//��ӡ*��
			}
			System.out.println();
		}
		
	}

}
