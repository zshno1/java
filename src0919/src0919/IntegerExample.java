public class IntegerExample{
//数据类型例
	
	public static void main(String args[]){
    byte  byteVariable;		//定义一个字节型变量
    short shortVariable;		//定义一个短整型变量
    int   baseVariable;		//定义一个基本型变量
    long  longVariable;		//定义一个长整型变量
    byteVariable=127;		//为它赋值127
    shortVariable=0100;		//为它赋一个八进制的值
    baseVariable=0x1234;		//为它赋一个十六进制的值
    longVariable=-12345689987654L;		//为它赋一个长整型的值
	   //下面依次输出这些变量的值
    System.out.println("字节型变量byteVariable="+byteVariable);
    System.out.println("短整型变量shortVariable="+shortVariable);
    System.out.println("基本型变量byteVariable="+baseVariable);
    System.out.println("长整型变量byteVariable="+longVariable);
  }
}