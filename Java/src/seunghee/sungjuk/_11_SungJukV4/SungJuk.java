package seunghee.sungjuk._11_SungJukV4;

import java.util.Scanner;

public class SungJuk {
	public static void main(String[] args) {

		String name[] = new String[3];
        int kor [] = new int [3];
        int eng [] = new int [3];
        int mat [] = new int [3];
        int sum [] = new int [3];
        double mean [] = new double[3];
        char grd [] = new char[3];

        readScore ( name, kor, eng, mat );
        computeScore ( kor, eng, mat, sum, mean, grd );
        printScore ( name, kor, eng, mat, sum, mean, grd );

    }

	// 성적 데이터 입력 받기
    static void readScore ( String name[], int kor[], int eng[], int mat[]) {

        Scanner scanner = new Scanner (System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + " 번째 학생 성적 입력중...");

            System.out.print("이름을 입력하세요 : ");
            name[i] = scanner.nextLine();
            System.out.print("국어를 입력하세요 : ");
            kor[i] = scanner.nextInt();
            System.out.print("영어를 입력하세요 : ");
            eng[i] = scanner.nextInt();
            System.out.print("수학을 입력하세요 : ");
            mat[i] = scanner.nextInt();
            String blink = scanner.nextLine();
            System.out.println();
        }
    }

    // 성적 데이터 총점, 평균, 학점 처리
    static void computeScore ( int kor[], int eng[], int mat[], int sum[], double mean[], char grd[]) {

        for (int i = 0; i < 3; i++) {
            sum[i] = (kor[i] + eng[i] + mat[i]);
            mean[i] = sum[i] / 3.0;

            switch ((int) mean[i] / 10) {
                case 10:
                case 9: grd[i] = '수'; break;
                case 8: grd[i] = '우'; break;
                case 7: grd[i] = '미'; break;
                case 6: grd[i] = '양'; break;
                default: grd[i] = '가'; break;
            }
        }
    }

    // 처리 결과 출력
    static void printScore ( String name[], int kor[], int eng[], int mat[], int sum[], double mean[], char grd[] ) {
    	
        String fmt = ("이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n---------\n총점 : %d\n평균 : %.2f\n학점 : %c\n---------\n");
        for (int i = 0; i < 3; i++) {
        	System.out.printf(fmt, name[i], kor[i], eng[i], mat[i], sum[i], mean[i], grd[i]);
        }
    }
}