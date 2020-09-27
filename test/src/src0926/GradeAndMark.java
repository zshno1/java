public class GradeAndMark {
	public static void main(String[] args) {
		String grade = "优";
		switch (grade) {
			case "优": {
				System.out.println("mark>=90");
				break;
			}
			case "良": {
				System.out.println("90>mark>=80");
				break;
			}
			case "中": {
				System.out.println("80>mark>=70");
				break;
			}
			case "及格": {
				System.out.println("70>mark>=60");
				break;
			}
			case "不及格": {
				System.out.println("60>mark>=0");
				break;
			}
			default: {
				System.out.println("mark error");
			}
		}
	}
}