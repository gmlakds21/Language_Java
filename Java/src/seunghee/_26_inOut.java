package seunghee;

public class _26_inOut {
	public static void main(String[] args) {
		
		int i;
		
		try {
			/* 알파뱃 하나만 입력받기 */{
				System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
				
				i = System.in.read();
				System.out.println((char)i);
			}
			
			/* 문자열로 입력받기 */ {
				System.out.println("알파뱃 여러 개를 쓰고 [Enter]를 누르세요");
				
				while((i = System.in.read()) != -1) {
					System.out.print((char)i);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
