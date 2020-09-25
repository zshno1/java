public class AgeClass {
	public static void main(String[] args) {
		int age = 84;
		if(age<4)
			System.out.println("婴儿");
		else if(age<=10)
			System.out.println("儿童");
		else if(age<=17)
			System.out.println("少年");
		else if(age<=35)
			System.out.println("青年");
		else if(age<=59)
			System.out.println("中年");
		else		
			System.out.println("老年");
	}
}