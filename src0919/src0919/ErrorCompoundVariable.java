public class ErrorCompoundVariable{
  public static void main(String args[]){
    int methodVariable=10;
    { int compoundVariable=20;
      System.out.println("methodVariable="+methodVariable);   		//��ȷ
      System.out.println("compoundVariable="+compoundVariable);		//��ȷ
    }
    System.out.println("methodVariable="+methodVariable);			//��ȷ
	System.out.println("compoundVariable="+compoundVariable);		//����
  }
}