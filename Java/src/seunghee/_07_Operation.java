package seunghee;

public class _07_Operation {
	public static void main(String[] args) {
		
		/* Operation1 */ {
			int mathScore = 90;
			int engScore = 70;
			
			int totalScore = mathScore + engScore;
			System.out.println(totalScore);
			
			double avgScore = totalScore / 2.0;
			System.out.println(avgScore);
		}
		/* Operation2 */ {
			System.out.println();
			int gameScore = 150;
			
			int lastScore = ++gameScore;
			System.out.println(lastScore);
			
			int lastScore2 = --gameScore;
			System.out.println(lastScore2);
		}
		/* Operation3 */ {
			System.out.println();
			
			int value1 = 10;
			int num1 = ++value1; // 11이 대입됨
			System.out.println(num1);
			
			int value2 = 10;
			int num2 = value2++; // 10이 대입됨
			System.out.println(num2);
		}
		/* Operation4 */ {
			System.out.println();
			int num1 = 10;
			int num2 = 10;
			boolean flag;
			
			flag = (num1 > 0) && (num2 > 0);
			System.out.println(flag);
			
			flag = (num1 < 0) && (num2 > 0);
			System.out.println(flag);
			
			flag = (num1 < 0) || (num2 > 0);
			System.out.println(flag);
		}
		/* Operation5 */ {
			System.out.println();
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
}
