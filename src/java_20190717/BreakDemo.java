package java_20190717;

public class BreakDemo {
	public static void main(String[] args) {
		if(true) return;
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if(i==6) break;
			sum += i;
		}
		System.out.printf("The total sum from 1 to 10 is %d.%n", sum);

		for (int first = 2; first <= 9; first++) {
			for (int second = 1; second <= 9; second++) {
				if(first==6) continue;
				System.out.printf("%d * %d = %d%n", first, second, first * second);
			}
		}

		for (int star = 5; star > 0; star--) {
			if (star == 5) {
				System.out.println("*****");
			} else if (star == 4) {
				System.out.println("****");
			} else if (star == 3) {
				System.out.println("***");
			} else if (star == 2) {
				System.out.println("**");
			} else if (star == 1) {
				System.out.println("*");
			}
		}
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int first = 9; first >= 2; first--) {
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d * %d = %d%n", first, second, first * second);
			}
		}
	}

}
