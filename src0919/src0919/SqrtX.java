//��������
public class SqrtX {
	public static void main(String[] args) {
		double x = 6;
		double r1 = 0;
		double r2 = 0;
		if(x < 0)
			System.out.println("��ֵ������ڵ���0");
		else {
			r1 = x/2;
			r2 = (r1+x/r1)/2;
			while(Math.abs(r1-r2)>=1e-5) {
				r1 = r2;
				r2 = (r1+x/r1)/2; 
			}
			System.out.println(x + "��ƽ������" + r2);
		}			
	}
}