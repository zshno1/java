public class  ShowOrder_2{
  public static void main(String[] args) {
     int a = 9;
     a += (a = 3);		// ��һ������
     System.out.println("a="+a);
     int b = 9;
     b = b + (b = 3);	//�ڶ�������
     System.out.println("b="+b);
  }
}