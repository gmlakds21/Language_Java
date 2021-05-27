package seunghee;

public class _08_If_Switch {
	public static void main(String[] args) {
		
		/* If1 */ {
			int age = 10;
			if (age >= 8) {
				System.out.println("학교에 다닙니다.");
			}
		}
		/* If2 */ {
			int age = 7;
			if(age >= 8) {
				System.out.println("학교에 다닙니다.");
			} else {
				System.out.println("학교에 다니지 않습니다.");
			}
		}
		/* If3 */ {
			int age = 9;
			int charge =0;
			if (age < 8) {
				charge = 1000;
			}
			System.out.println(charge);
		}
	}
}
