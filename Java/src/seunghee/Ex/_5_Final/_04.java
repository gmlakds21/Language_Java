package seunghee.Ex._5_Final;

import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {

		// 이진수
		
		Scanner sc = new Scanner(System.in);
        System.out.print("2진수로 확인하고 싶은 번호를 입력해 주세요 : ");
        int A = sc.nextInt();

        int a = 1;
        while (a <= (A/2)) {
        	a *= 2;
        }

        System.out.print("\nB /");
        for (int i=a; i>=1; i/=2) {
        	System.out.printf(" %4d ", i);
        }
        System.out.print("\n    ");
        for (int i=a; i>=1; i/=2) {
        	System.out.print("------");
        }
        System.out.println( );
        
        // 2진수 변환
        System.out.print("B /    ");
        for (int i = a; i>=1; i/=2) {
            int B = A / i;
            if (B==1) {
            	A -= i;
            }
            System.out.print(B+ "     ");
        }
    }
}