package java_20190718;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * 
		 * -?��?�� 만들�? 1. 1?�� 1?�� 1?�� ?��?��?�� 2. 1?�� 365?�� ?���?, ?��?��?��?��?�� 366?�� - 2?�� 29?�� 3. ?��?��?? 4?��마다 발생?���?
		 * 그중?��?�� 100?�� 배수?�� ?��?��?���? 400배수?�� ?��?��?���? ?��?��?��. 4. 2019?�� 12?�� 25?�� 무슨?��까요? 5. 2018?��까�? 총일?��,
		 * 11?��까�? 총일?��, 25?�� ?��?��?�� 7�? ?��?�� ?��머�?�? 1?���? ?��?��?��, 2?���? ?��?��?��....
		 *
		 */

		int year = 2020;
		int month = 3;
		int day = 15;
		// preYear => 2018?��?��
		int preYear = year - 1;
		// preMonth => 2019?�� 11?��
		int preMonth = month - 1;
		int totalCount = 0;

		// 2018?��?��까�? 총일 ?�� 구하�?
		totalCount = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);

		// 2019?��?�� 11?��까�? ?�� 구하�?
		totalCount += 31 + 29;

		totalCount += day;

		int dayOfWeek = totalCount % 7;
		String message = null;
		if (dayOfWeek == 1) {
			message = "?��?��?��";
		} else if (dayOfWeek == 2) {
			message = "?��?��?��";
		} else if (dayOfWeek == 3) {
			message = "?��?��?��";
		} else if (dayOfWeek == 4) {
			message = "목요?��";
		} else if (dayOfWeek == 5) {
			message = "금요?��";
		} else if (dayOfWeek == 6) {
			message = "?��?��?��";
		} else if (dayOfWeek == 0) {
			message = "?��?��?��";
		}
		System.out.println(year + "?�� " + month + "?�� " 
		+ day + "?�� " + message);
	}
}
