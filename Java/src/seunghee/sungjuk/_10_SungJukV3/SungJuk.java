package seunghee.sungjuk._10_SungJukV3;

import java.util.Scanner;

public class SungJuk {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name[] = new String[3];
		int kor[] = new int[3];
		int eng[] = new int[3];
		int mat[] = new int[3];
		int sum[] = new int[3];
		double mean[] = new double[3];
		char grd[] = new char[3];
		
		// 입력 부분
		for (int i=0; i<3; i++) {
			System.out.println((i+1)+"번째 학생 성적 입력중");
			System.out.print("이름을 입력하세요 : ");
			name[i] = sc.nextLine();
			System.out.print("국어를 입력하세요");
			kor[i] = sc.nextInt();
			System.out.print("영어를 입력하세요");
			eng[i] = sc.nextInt();
			System.out.print("수학를 입력하세요");
			mat[i] = sc.nextInt();
			String blink = sc.nextLine();
			
			sum[i] = (kor[i] + eng[i] + mat[i]);
			mean[i] = sum[i]/3.0;
			switch((int)mean[i]/10) {
				case 10 :
				case 9 :grd[i] = '수'; break;
				case 8 :grd[i] = '우'; break;
				case 7 :grd[i] = '미'; break;
				case 6 :grd[i] = '양'; break;
				default :grd[i] = '가';
			}
			System.out.println();
		}
		
		// 출력 부분
		for (int i=0; i<3; i++) {
	        String fmt = ("이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n---------\n총점 : %d\n평균 : %.2f\n학점 : %c");
	        System.out.printf(fmt, name[i], kor[i], eng[i], mat[i], sum[i], mean[i], grd[i]);
		}
	}
}
