package seunghee;

public class _07_Operation {
	public static void main(String[] args) {
		
		// 총점, 평균 계산
		int mathScore = 90;
		int engScore = 70;
		int totalScore = mathScore + engScore;
		double avgScore = totalScore / 2.0;
		System.out.println(totalScore);		
		System.out.println(avgScore);
		System.out.println();
		
		// ++, -- 연산자
		int gameScore = 150;
		int lastScore = ++gameScore;
		System.out.println(lastScore);
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		System.out.println();
		
		// ++num, num++
		int value1 = 10;
		int num1 = ++value1; // 11이 대입됨
		System.out.println(num1);
		
		int value2 = 10;
		int num2 = value2++; // 10이 대입됨
		System.out.println(num2);
		System.out.println();
		
		// &&, || 연산자 
		int num3 = 10;
		int num4 = 10;
		boolean flag;
		flag = (num3 > 0) && (num4 > 0);
		System.out.println(flag);
		flag = (num3 < 0) && (num4 > 0);
		System.out.println(flag);
		flag = (num3 < 0) || (num4 > 0);
		System.out.println(flag);
		System.out.println();
		
		// 복합
		int num = 10;
		int i = 2;
		boolean value;
		
		value = ((num = num +10) < 10) && ((i = i +2) < 10);
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);
		
		value = ((num = num +10) > 10) || ((i = i +2) < 10);
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);
	}
}
