package java_20190724;
import java_20190724.Test;//Test 클래스를 import하기 위해서는 Test클래스의 접근한정자는 public 이어야 한다.

public class TestDemo {
	public static void main(String[] args) {
		//Test t = new Test();
		System.out.println("Hello");
	}
	//Test1, Test2 클래스는 Test.java 파일안에서 선언은 가능하나
	//서로다른 패키지에서 사용할 수 없다.
	//Test1, Test2 클래스를 서로 다른 패키지에서 사용하기 위해서는
	//각각 별도의 파일을 만들어 접근 한정자를 public 으로 선언하여 사용해야 한다. 
}
