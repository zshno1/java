//ǰ׺��׺����
public class Compare{
  public static void main(String args[]){
    int prefix, postfix,rs;
    prefix=1;
    rs=++prefix;		//�ȼ�1�ٸ�ֵ
    System.out.println("ǰ׺�������prefix=" + prefix + "  rs=" + rs);
    prefix=1;
    rs=--prefix;		//�ȼ�1�ٸ�ֵ
    System.out.println("ǰ׺�������prefix=" + prefix + "  rs=" + rs);
    postfix=1;
    rs=postfix++;	//��postfix��1֮ǰ��ֵ������rs
    System.out.println("��׺�������postfix=" + postfix + "  rs=" + rs);
    postfix=1;
    rs=postfix--;	//��postfix��1֮ǰ��ֵ������rs
    System.out.println("��׺�������postfix=" + prefix + "  rs=" + rs);
  }
}