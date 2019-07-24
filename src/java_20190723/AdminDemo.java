package java_20190723;

public class AdminDemo {
	public static void main(String[] args) {
		Admin a = new Admin("hbn5054","1q2w3e4r","hbn5054@psu.edu",1);
		//a.setId("hbn5054");
		//a.setPwd("1q2w3e4r");
		//a.setEmail("hbn5054@psu.edu");\
		//a.setLevel(1);
		System.out.printf("%s,%s,%s,%d %n",
				a.getId(),a.getPwd(),a.getEmail(),a.getLevel());
	}
}
