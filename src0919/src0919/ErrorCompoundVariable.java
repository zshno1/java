public class ErrorCompoundVariable{
  public static void main(String args[]){
    int methodVariable=10;
    { int compoundVariable=20;
      System.out.println("methodVariable="+methodVariable);   		//正确
      System.out.println("compoundVariable="+compoundVariable);		//正确
    }
    System.out.println("methodVariable="+methodVariable);			//正确
	System.out.println("compoundVariable="+compoundVariable);		//错误
  }
}