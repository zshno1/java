package ch02;

public class Overload
{
	// ���涨��������test()���������������β��б�ͬ
	// ϵͳ�����������������������ֱ���Ϊ��������
	public void test()
	{
		System.out.println("�޲���");
	}
	public void test(String msg)
	{
		System.out.println("���ص�test���� " + msg);
	}
	public static void main(String[] args)
	{
		Overload ol = new Overload();
		// ����test()ʱû�д�����������ϵͳ��������û�в�����test()������
		ol.test();
		// ����test()ʱ������һ���ַ���������
		// ���ϵͳ���������һ���ַ���������test()������
		ol.test("hello");
	}
}
