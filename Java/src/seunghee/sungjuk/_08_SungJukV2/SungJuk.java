package seunghee.sungjuk._08_SungJukV2;

import java.util.Scanner;

public class SungJuk {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해 주세요 : ");
		String name = sc.nextLine();
		System.out.print("국어 점수를 입력해 주세요 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력해 주세요 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수를 입력해 주세요 : ");
		int mat = sc.nextInt();
		
		int sum = (kor+eng+mat);
		double mean = sum/3.0;
		mean = Double.parseDouble(String.format("%.1f", mean));
		char grd = 'o';
		
		switch ((int)mean/10) {
			case 10 : 
			case 9 : grd = '수'; break;
			case 8 : grd = '우'; break;
			case 7 : grd = '미'; break;
			case 6 : grd = '양'; break;
			default : grd = '가'; break;
		}
		
        String fmt = ("이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n---------\n총점 : %d\n평균 : %.2f\n학점 : %c");
        String result = String.format(fmt, name, kor, eng, mat, sum, mean, grd);
        System.out.println(result);
	}
}
