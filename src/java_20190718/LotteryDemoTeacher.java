package java_20190718;

public class LotteryDemoTeacher {
	public static void main(String[] args) {
		//Math.random() => Greater than or equal to 0, and Smaller or equal to 1, positive number will be generated as a double value.

		
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			double random = Math.random();
			int temp = (int)(random * 45) + 1;	
			
			
			lotto[i]  = temp;
		}
		//Erase overlap
		if(lotto[0] == lotto[1] || lotto[0] == lotto[2] || lotto[0] == lotto[3] || lotto[0] == lotto[4] || lotto[0] ==lotto[5]) {
			double random = Math.random();
			int temp = (int)(random *45) + 1;
			
			lotto[0] = temp;
		}

		if(lotto[1] == lotto[0] || lotto[1] == lotto[2] || lotto[1] == lotto[3] || lotto[1] == lotto[4] || lotto[1] ==lotto[5]) {
			double random = Math.random();
			int temp = (int)(random *45) + 1;
			
			lotto[1] = temp;
		}
		
		if(lotto[2] == lotto[0] || lotto[2] == lotto[1] || lotto[2] == lotto[3] || lotto[2] == lotto[4] || lotto[2] ==lotto[5]) {
			double random = Math.random();
			int temp = (int)(random *45) + 1;
			
			lotto[2] = temp;
		}
		
		if(lotto[3] == lotto[0] || lotto[3] == lotto[1] || lotto[3] == lotto[2] || lotto[3] == lotto[4] || lotto[3] ==lotto[5]) {
			double random = Math.random();
			int temp = (int)(random *45) + 1;
			
			lotto[3] = temp;
		}
		
		if(lotto[4] == lotto[0] || lotto[4] == lotto[1] || lotto[4] == lotto[2] || lotto[4] == lotto[3] || lotto[4] ==lotto[5]) {
			double random = Math.random();
			int temp = (int)(random *45) + 1;
			
			lotto[4] = temp;
		}
		
		if(lotto[5] == lotto[0] || lotto[5] == lotto[1] || lotto[5] == lotto[2] || lotto[5] == lotto[3] || lotto[5] ==lotto[4]) {
			double random = Math.random();
			int temp = (int)(random *45) + 1;
			
			lotto[5] = temp;
		}

		for (int i =0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "  ");
		}
		
	}

}
