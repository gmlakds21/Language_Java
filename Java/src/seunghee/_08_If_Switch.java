package seunghee;

public class _08_If_Switch {
	public static void main(String[] args) {
		
		int age;

		age = 10;
		if (age >= 8) {
			System.out.println("학교에 다닙니다.");
		}

		age = 7;
		if(age >= 8) {
			System.out.println("학교에 다닙니다.");
		} else {
			System.out.println("학교에 다니지 않습니다.");
		}

		age = 9;
		int charge =0;
		if (age < 8) {
			charge = 1000;
		}
		System.out.println(charge);
		
		String student = "중학생";
		switch(student) {
			case "초등학생" : System.out.println("무료입니다."); break;
			case "중학생" : System.out.println("700원 입니다."); break;
			case "고등학생" : System.out.println("100원 입니다."); break;
			case "성인" : System.out.println("1200원 입니다."); break;
			default : System.out.println("다시 확인해주세요");
		}
		
	}
}
