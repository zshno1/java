public class IntegerExample{
//����������
	
	public static void main(String args[]){
    byte  byteVariable;		//����һ���ֽ��ͱ���
    short shortVariable;		//����һ�������ͱ���
    int   baseVariable;		//����һ�������ͱ���
    long  longVariable;		//����һ�������ͱ���
    byteVariable=127;		//Ϊ����ֵ127
    shortVariable=0100;		//Ϊ����һ���˽��Ƶ�ֵ
    baseVariable=0x1234;		//Ϊ����һ��ʮ�����Ƶ�ֵ
    longVariable=-12345689987654L;		//Ϊ����һ�������͵�ֵ
	   //�������������Щ������ֵ
    System.out.println("�ֽ��ͱ���byteVariable="+byteVariable);
    System.out.println("�����ͱ���shortVariable="+shortVariable);
    System.out.println("�����ͱ���byteVariable="+baseVariable);
    System.out.println("�����ͱ���byteVariable="+longVariable);
  }
}