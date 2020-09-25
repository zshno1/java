//前缀后缀运算
public class Compare{
  public static void main(String args[]){
    int prefix, postfix,rs;
    prefix=1;
    rs=++prefix;		//先加1再赋值
    System.out.println("前缀加运算后：prefix=" + prefix + "  rs=" + rs);
    prefix=1;
    rs=--prefix;		//先减1再赋值
    System.out.println("前缀减运算后：prefix=" + prefix + "  rs=" + rs);
    postfix=1;
    rs=postfix++;	//将postfix加1之前的值赋给了rs
    System.out.println("后缀加运算后：postfix=" + postfix + "  rs=" + rs);
    postfix=1;
    rs=postfix--;	//将postfix减1之前的值赋给了rs
    System.out.println("后缀减运算后：postfix=" + prefix + "  rs=" + rs);
  }
}