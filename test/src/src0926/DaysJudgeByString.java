public class DaysJudgeByString {
	public static void main(String[] args) {
		int year = 2020, days = 0, mon = 0;
		String month = "Feb";
		switch (month) {
		case "Jan":
			mon = 1;
			days = 31;
			break;
		case "Mar":
			mon = 3;
			days = 31;
			break;
		case "May":
			mon = 5;
			days = 31;
			break;
		case "Jul":
			mon = 7;
			days = 31;
			break;
		case "Aug":
			mon = 8;
			days = 31;
			break;
		case "Oct":
			mon = 10;
			days = 31;
			break;
		case "Dec":
			mon = 12;
			days = 31;
			break;
		case "Apr":
			mon = 4;
			days = 30;
			break;
		case "Jun":
			mon = 6;
			days = 30;
			break;
		case "Sep":
			mon = 9;
			days = 30;
			break;
		case "Nov":
			mon = 11;
			days = 30;
			break;
		case "Feb":
			mon = 2;
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400) == 0)
				days = 29;
			else
				days = 28;
			break;
		default:
			System.out.println("年月有误，请检查");
		}
		System.out.println(year + "年" + mon + "月共有" + days + "天");
	}
}