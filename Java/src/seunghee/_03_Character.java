package seunghee;

public class _03_Character {
	public static void main(String[] args) {
		
		/* Character */ {
			System.out.println("Character1");
			
			char ch1 = 'A';
			System.out.println(ch1);
			System.out.println((int)ch1);
			
			char ch2 = 66;
			System.out.println(ch2);
			
			int ch3 = 67;
			System.out.println(ch3);
			System.out.println((char)ch3);
		}
		/* Character2 */ {
			System.out.println("\nCharacter2");
			
			char ch1 = '한';
			char ch2 = '\uD55C'; // 한이라는 글자의 유니코드 값 (16 진수)
			System.out.println(ch1);
			System.out.println(ch2);
		}
		/* Character3 */ {
			System.out.println("\nCharacter3");
			
			int a = 65;
			int b = -65;
			
			char a2 = 65;
			// char b22 = -65; // char형에 음수를 넣으면 오류가 뜬다.
			
			System.out.println((char)a);
			System.out.println((char)b); // ?라는 것은 모르는 문자라는 의미이다.
			System.out.println(a2);
		}
	}
}
