package java_20190718;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * 
		 * -?¬? ₯ λ§λ€κΈ? 1. 1? 1? 1?Ό ???Ό 2. 1? 365?Ό ?΄κ³?, ?€??Ό?? 366?Ό - 2? 29?Ό 3. ?€??? 4?λ§λ€ λ°μ?κ³?
		 * κ·Έμ€?? 100? λ°°μ? ? ?Έ?κ³? 400λ°°μ? ? ?Έ?μ§? ???€. 4. 2019? 12? 25?Ό λ¬΄μ¨?ΌκΉμ? 5. 2018?κΉμ? μ΄μΌ?,
		 * 11?κΉμ? μ΄μΌ?, 25?Ό ??΄? 7λ‘? ?? ?λ¨Έμ?κ°? 1?΄λ©? ???Ό, 2?΄λ©? ???Ό....
		 *
		 */

		int year = 2020;
		int month = 3;
		int day = 15;
		// preYear => 2018??
		int preYear = year - 1;
		// preMonth => 2019? 11?
		int preMonth = month - 1;
		int totalCount = 0;

		// 2018??κΉμ? μ΄μΌ ? κ΅¬νκΈ?
		totalCount = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);

		// 2019?? 11?κΉμ? ?© κ΅¬νκΈ?
		totalCount += 31 + 29;

		totalCount += day;

		int dayOfWeek = totalCount % 7;
		String message = null;
		if (dayOfWeek == 1) {
			message = "???Ό";
		} else if (dayOfWeek == 2) {
			message = "???Ό";
		} else if (dayOfWeek == 3) {
			message = "???Ό";
		} else if (dayOfWeek == 4) {
			message = "λͺ©μ?Ό";
		} else if (dayOfWeek == 5) {
			message = "κΈμ?Ό";
		} else if (dayOfWeek == 6) {
			message = "? ??Ό";
		} else if (dayOfWeek == 0) {
			message = "?Ό??Ό";
		}
		System.out.println(year + "? " + month + "? " 
		+ day + "?Ό " + message);
	}
}
