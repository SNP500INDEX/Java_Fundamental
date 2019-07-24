package java_20190723;

public class VarArgDemo {
	public VarArgDemo() {
		
	}
	public long sum(int... temp) {
		int sum = 0; //지역변수, 매서드내에서 유효함.
		
		for(int t : temp) {
			sum += t;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		VarArgDemo v1 = new VarArgDemo();
		
		long s1 = v1.sum(1,2);
		System.out.println(s1);
		long s2 = v1.sum(1,2,3,4);
		System.out.println(s2);
	}
}
