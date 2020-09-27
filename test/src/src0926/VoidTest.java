package ch02;
public class VoidTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1();
		VoidTest t = new VoidTest();
		t.say();
	}
	public static void s1() {
		System.out.println("s1");
	}

	public void say1() {
		System.out.println("say1");
	}
	public void say() {
		s1();
		say1(); // 调用say1方法
	}
}
