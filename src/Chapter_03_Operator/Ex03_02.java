package Chapter_03_Operator;

public class Ex03_02 {
	public static void main(String args[]) {
		int i=5, j=0;
		j=i++;
		System.out.println("j=i++; 실행 후, i=" + i + ", j=" +j);
		
		i=5; //결과 비교를 위해, i와 j값을 다시 5와 0으로 변경
		j=0;
		
		j= ++i;
		System.out.println("j=++i; 실행 후, i=" + i + ", j=" +j);
	}

}
