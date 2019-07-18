package java_20190717;

public class SwitchDemo {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = null;
		//Case value have to be identifiable.
		switch (month) {
		case 12:
			season = "winter";
			break;
		case 1:
			season = "winter";
			break;
		case 2:
			season = "winter";
			break;
		case 3:
			season = "spring";
			break;
		case 4:
			season = "spring";
			break;
		case 5:
			season = "spring";
			break;
		case 6:
			season = "summer";
			break;
		case 7:
			season = "summer";
			break;
		case 8:
			season = "summer";
			break;
		case 9:
			season = "fall";
			break;
		case 10:
			season = "fall";
			break;
		case 11:
			season = "fall";
			break;
		default:
			season = "Wrong Input";
		}
		System.out.printf("The %d month is %s.", month, season);
	}

}
