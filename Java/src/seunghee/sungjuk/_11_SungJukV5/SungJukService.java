package seunghee.sungjuk._11_SungJukV5;

import java.util.Scanner;

public class SungJukService {
	
	SungJukVO setSungJuk() {

		Scanner scanner = new Scanner(System.in);
	
		System.out.print("이름을 입력해 주세요 : ");
		String name = scanner.nextLine();
	  	System.out.print("국어 점수를 입력해 주세요 : ");
	  	int kor = scanner.nextInt();
	  	System.out.print("영어 점수를 입력해 주세요 : ");
	  	int eng = scanner.nextInt();
	  	System.out.print("수학 점수를 입력해 주세요 : ");
	  	int mat = scanner.nextInt();
	  	System.out.println();
	
	  	// 클래스 단위의 리턴값
	  	return new SungJukVO (name, kor, eng, mat, 0, 0, '0');
	}

	void computeSungJuk(SungJukVO person) {

		person.setSum(person.getKor() + person.getEng() + person.getMat());
		person.setMean(person.getSum() / 3.0);
		switch ((int)person.getMean() / 10) {
			case 10:
			case 9: person.setGrd ('수'); break;
			case 8: person.setGrd ('우'); break;
			case 7: person.setGrd ('미'); break;
			case 6: person.setGrd ('양'); break;
			default: person.setGrd ('가');break;
		}
	}
}