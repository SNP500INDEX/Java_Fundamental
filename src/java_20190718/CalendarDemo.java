package java_20190718;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * 
		 * -?‹¬? ¥ ë§Œë“¤ê¸? 1. 1?…„ 1?›” 1?¼ ?›”?š”?¼ 2. 1?…„ 365?¼ ?´ê³?, ?œ¤?…„?¼?•Œ?Š” 366?¼ - 2?›” 29?¼ 3. ?œ¤?…„?? 4?…„ë§ˆë‹¤ ë°œìƒ?•˜ê³?
		 * ê·¸ì¤‘?—?„œ 100?˜ ë°°ìˆ˜?Š” ? œ?™¸?•˜ê³? 400ë°°ìˆ˜?Š” ? œ?™¸?•˜ì§? ?•Š?Š”?‹¤. 4. 2019?…„ 12?›” 25?¼ ë¬´ìŠ¨?¼ê¹Œìš”? 5. 2018?…„ê¹Œì? ì´ì¼?ˆ˜,
		 * 11?›”ê¹Œì? ì´ì¼?ˆ˜, 25?¼ ?”?•´?„œ 7ë¡? ?‚˜?ˆˆ ?‚˜ë¨¸ì?ê°? 1?´ë©? ?›”?š”?¼, 2?´ë©? ?™”?š”?¼....
		 *
		 */

		int year = 2020;
		int month = 3;
		int day = 15;
		// preYear => 2018?…„?„
		int preYear = year - 1;
		// preMonth => 2019?…„ 11?›”
		int preMonth = month - 1;
		int totalCount = 0;

		// 2018?…„?„ê¹Œì? ì´ì¼ ?ˆ˜ êµ¬í•˜ê¸?
		totalCount = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);

		// 2019?…„?„ 11?›”ê¹Œì? ?•© êµ¬í•˜ê¸?
		totalCount += 31 + 29;

		totalCount += day;

		int dayOfWeek = totalCount % 7;
		String message = null;
		if (dayOfWeek == 1) {
			message = "?›”?š”?¼";
		} else if (dayOfWeek == 2) {
			message = "?™”?š”?¼";
		} else if (dayOfWeek == 3) {
			message = "?ˆ˜?š”?¼";
		} else if (dayOfWeek == 4) {
			message = "ëª©ìš”?¼";
		} else if (dayOfWeek == 5) {
			message = "ê¸ˆìš”?¼";
		} else if (dayOfWeek == 6) {
			message = "?† ?š”?¼";
		} else if (dayOfWeek == 0) {
			message = "?¼?š”?¼";
		}
		System.out.println(year + "?…„ " + month + "?›” " 
		+ day + "?¼ " + message);
	}
}
