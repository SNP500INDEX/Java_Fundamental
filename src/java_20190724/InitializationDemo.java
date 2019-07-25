package java_20190724;

//i18n => Internationalization
//l10n => localization
public class InitializationDemo {
	int a;
	static int b;
	static final int C = 10;
// static 초기화
	static {
		System.out.println("static area");
		b = 100;
	}

	// 생성자에서 초기화 할 수 있는 변수는 instance 변수만
	public InitializationDemo(int a) {
		super();
		this.a = a;

	}

	public static void main(String[] args) {
		InitializationDemo i = new InitializationDemo(1000);
		System.out.println(i.a);
		System.out.println(C);
	}
}
