package java_20190725.step2;

import java_20190725.step2.StopWatch;

public class SotpWatchDemo {
	public static void main(String[] args) {
		StopWatch s1 = new StopWatch();
		//currentTimeMillis()=>1970 1 1 부터 지금까지 시간을 나노세컨드로 반환한다.
		s1.startNano();
		for(long i= 0; i<10_000_000_000l; i++) {
			
		}
		
		s1.stopNano();
		
		double elapsedTime = s1.getElapsedNanoTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}

}
