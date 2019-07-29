package java_20190725;

public class SubDemo {
	public static void main(String[] args) {
		Sub s1 = new Sub();
		//s1.makeMoney();
		s1.gotoSchool();
		//s1.play(starcraft);
		
		s1.money = 1000000;
		s1.chicken = "교촌치킨2마리";
		
		Super s2 = new Sub();
		s2.makeMoney();
		s2.play("starcraft");
		s2.money = 1000000;
	}
}
