package seunghee;

public class _09_For_While {
	public static void main(String[] args) {
		
		int sum = 0;
		
		// for 문
		for(int i=0; i<=10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합은 "+sum+"입니다.\n");
		
		// 구구단
		for(int i=2; i<10; i++) {
			System.out.println(i+" 단");
			for(int j=1; j<10; j++) {
				System.out.println(i+" X "+j+" = "+i*j);
			}
			System.out.println();
		}
		
		// continue 문
		sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1부터 100까지 홀수들의 합은 "+sum+"입니다.");
	
		// break 문
		sum = 0;
		for(int i=1; ; i++) {
			if(i % 2 != 0) {
				continue;
			}
			sum += i;
			if(i > 100) {
				break;
			}
		}
		System.out.println("1부터 100까지 짝수들의 합은 "+sum+"입니다.");
	}
}
