package seunghee.sungjuk._11_SungJukV5;

public class SungJukDAO {
	
	void printSungJuk ( SungJukVO person ) {
		String fmt = ("이름 : %s\n-----------\n국어 : %d\n영어 : %d\n수학 : %d\n-----------\n총점 : %d\n평균 : %.2f\n학점 : %c\n-----------\n");
		System.out.printf(fmt, person.getName(), person.getKor(), person.getEng(), person.getMat(), person.getSum(), person.getMean(), person.getGrd());
	}
}
