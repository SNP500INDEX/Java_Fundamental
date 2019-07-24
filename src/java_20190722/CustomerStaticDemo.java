package java_20190722;

public class CustomerStaticDemo {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.name = "Hong Gil Dong";
		c1.age = 40;
		c1.email = "kdhong@test.com";
		c1.phone = "010-8080-0987";
		c1.balance = 190000.43;
		c1.isReleased = false;
		c1.interestRate = 3.5;
		
		Customer c2 = new Customer();
		c2.name = "Ah Mu Gae";
		c2.age = 50;
		c2.email = "noname@test.com";
		c2.phone = "010-2345-9876";
		c2.balance = 350000.45;
		c2.isReleased = false;
		
		Customer c3 = new Customer();
		c3.name = "Jeff";
		c3.age = 62;
		c3.email = "baejaws@amazon.com";
		c3.phone = "010-1111-1111";
		c3.balance = 12000000000.45;
		c3.isReleased = true;
	}
}
