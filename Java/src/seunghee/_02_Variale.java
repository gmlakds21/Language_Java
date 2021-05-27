package seunghee;

public class _02_Variale {
	public static void main(String[] args) {
		
		/* Variable 1 */ {
			System.out.println("Variable1");
			
			int level;
			level = 10;
			System.out.println(level);
		}
		/* Variable 2 */ {
			System.out.println("\nVariable2");
			
			int level = 10;
			System.out.println(level);
		}
		/* IntegerVariable */ {
			System.out.println("\nIntVariable");
			
			short sVal = 10;
			byte bVal = 20;
			System.out.println(sVal + bVal);
		}
		/* Long */ {
			System.out.println("\nLong");
			
			int num1 = 123456789;
			long num2 = 123456789L;
			long num3 = 123456789; // 이경우 자동으로 int 로 변환됨
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
		}
	}
}
