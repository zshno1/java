public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x ;
		double y ;
		x = (int)12.34 + (int)45.79 ; //丢失精度
		y = (double)x +(double)100 + 1 ; //提高精度
		System.out.println("x= " + x);
		System.out.println("y= " + y);
	}

}
