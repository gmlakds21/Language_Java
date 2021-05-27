package seunghee;

public class _20_StringBuffer_StringBuilder {
	public static void main(String[] args) {
		
		/* 기존의 String 사용법 */ {
			/* String 변수가 새로 변경될 때마다
			 * 계속해서 다른 공간을 만든다.
			 * StringBuffer, StringBuilder 추천
			 * */
			String str1 = "Hello ";
			String str2 = "World!! ";
			str1 = str1 + str2;
			str1 = str1 + "WoW~ ";
			str1 = "Oh~ " + str1;
			
			System.out.println(str1);
		}
		
		/* StringBuffer, StringBuilder */ {
			StringBuffer sb = new StringBuffer();
			sb.append("Hello ").append("World!! ").append("Wow~ ");
			System.out.println(sb);
		}
		
		/* 문자열간 비교 */ {
			// == 연산자는 값을 비교하는 것이 아닌 메모리 위치를 비교함
			// 따라서 .equals( ) 메서드를 이용함
			String a = "Hello";
			String b = "He"+"llo";
			String c = new String("Hello");
			
			System.out.println((a == b) ? 'T' : 'F');
			System.out.println((a == c) ? 'T' : 'F');
			System.out.println((b == c) ? 'T' : 'F');
			
			System.out.println(a.equals(b));
			System.out.println(a.equals(c));
			System.out.println(b.equals(c));
		}
	}
}