package seunghee.Ex._2_For_While;

import java.util.Scanner;

public class _03 {
    public static void main(String[] args) {
    	
    	// 윤년을 구하는 공식

        Scanner scanner = new Scanner(System.in);
        System.out.println("확인하고 싶은 년도를 구하시오 : ");
        int year = scanner.nextInt( );

        if (((year % 100 != 0) && (year % 4 == 0)) || (year % 400 == 0)) {
            System.out.printf("%4d년은 윤년입니다.", year);
        } else {
            System.out.printf("%4d년은 윤년이 아닙니다. ", year);
        }
    }
}