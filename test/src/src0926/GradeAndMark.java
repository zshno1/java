public class GradeAndMark {
	public static void main(String[] args) {
		String grade = "��";
		switch (grade) {
			case "��": {
				System.out.println("mark>=90");
				break;
			}
			case "��": {
				System.out.println("90>mark>=80");
				break;
			}
			case "��": {
				System.out.println("80>mark>=70");
				break;
			}
			case "����": {
				System.out.println("70>mark>=60");
				break;
			}
			case "������": {
				System.out.println("60>mark>=0");
				break;
			}
			default: {
				System.out.println("mark error");
			}
		}
	}
}