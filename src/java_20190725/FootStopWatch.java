package java_20190725;
//1. 요구사항은 밀리 세컨드로 경과 시간을 만들어주세요.

public class FootStopWatch {
	long startTime;
	long endTime;
	
	public double getElapsedTime() {
		return (double)(endTime - startTime)/(double)1000;
	}
	
	public static void main(String[] args) {
		FootStopWatch f1 = new FootStopWatch();
		//currentTimeMillis()=>1970 1 1 부터 지금까지 시간을 밀리세컨드로 반환한다.
		f1.startTime = System.currentTimeMillis();
		
		
		for(long i= 0; i<10_000_000_000l; i++) {
			
		}
		
		f1.endTime = System.currentTimeMillis();
		
		double elapsedTime = f1.getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}
}
