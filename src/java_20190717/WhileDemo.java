package java_20190717;

public class WhileDemo {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.printf("The sum of 1 to 10 is %d.%n", sum);

		int first = 2;
		while (first <= 9) {
			int second = 1;
			while (second <= 9) {
				System.out.printf("%d * %d = %d%n", first, second, first * second);
				second++;

			}
			System.out.println("-------------------");
			first++;
		}
	}

}
