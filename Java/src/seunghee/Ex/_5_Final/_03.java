package seunghee.Ex._5_Final;

import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		
		// 최종 정리
		
        Scanner scanner = new Scanner(System.in);

        final int NUM = 10;
        int [][] arr1 = new int [2][NUM] ;
        int [] arr2 = new int [] { 30, 60, 40, 70, 50, 100, 20, 90, 10, 80 };

        for (int i = 0; i < NUM; i++) {
        	arr1[0][i] = arr2[i];
        }

        for (int i = 0; i < NUM; i++) {
        	arr1[1][i] = 1;
        }

        // 초기 입력 값
        System.out.println("----초기 입력 값-------");
        for ( int i = 0; i < 2; i++) {
            for (int j = 0; j < NUM; j++) {
                System.out.printf("%3d ", arr1[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // 순위 석차
        for (int i = 0; i < NUM; i++) {
        	arr1[1][i] = 1;
        }

        for (int i = 0; i < NUM-1; i++) {
            for (int j = i+1; j < NUM; j++) {
                if (arr1[0][i] < arr1[0][j]) {
                	arr1[1][i] = arr1[1][i] + 1;
                } else if (arr1[0][i] > arr1[0][j]) {
                	arr1[1][j] = arr1[1][j] + 1;
                }
            }
        }

        // 순위 석차 출력
        System.out.println("-----순위 석차 출력------");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < NUM; j++) {
                System.out.printf("%3d ", arr1[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");

        // 순위 석차 알아보기
        while (true) {
            System.out.printf("조회할 점수를 입력해 주세요(다음 : 0) : ");
            int input = scanner.nextInt();
            if (input == 0) {
            	break;
            }

            int flag = 0;
            for (int i = 0; i < NUM; i++) {
                if (arr1[0][i] == input) {
                    System.out.printf("--------- 해당 점수의 순위 ----------\n");
                    System.out.printf("cnt=%3d , arr1[0][%d]=%4d \n", (i + 1), (i + 1), arr1[0][i]);
                    System.out.printf("cnt=%3d , arr1[1][%d]=%4d \n", (i + 1), (i + 1), arr1[1][i]);
                    System.out.printf("--------- ---------------------------\n");
                    flag = 1;
                    break;
                }
            }
            
            if (flag == 0) {
            	System.out.printf("정렬 실행");
            }
        }

        // 삽입 정렬
        int temp = 0;
        for (int i = 0; i < NUM-1; i++) {
            int sw = 0;
            for (int j = 0; j < NUM-1-i; j++) {
                if (arr1[0][j] > arr1[0][j+1]) {
                    for (int k = 0; k < 2; k++) {
                        temp = arr1[k][j];
                        arr1[k][j] = arr1[k][j + 1];
                        arr1[k][j + 1] = temp;
                    }
                    sw = 1;
                }
            }
            if (sw == 0) { break; }
        }

        // 삽입 정렬 출력
        System.out.println("등수에 따른 정렬");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < NUM; j++) {
                System.out.printf("%4d", arr1[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");

        // 순위 석차 알아보기
        while (true) {
            System.out.printf("조회할 점수를 입력해 주세요 : (종료 : 0)");
            int input = scanner.nextInt();
            if ( input == 0 ) { break; }

            int count = 0;
            int low = 0;
            int high = NUM - 1;

            while (true) {
                if (low > high) {
                	System.out.printf(" %d ", count);
                	break;
                } else {
                    int mid = (low + high) / 2;
                    if (arr1[0][mid] == input) {
                        System.out.printf("--------- 해당 점수의 순위 ----------\n");
                        System.out.printf("arr1[0][%d]=%4d \n", mid, arr1[0][mid]);
                        System.out.printf("arr1[1][%d]=%4d \n", mid, arr1[1][mid]);
                        System.out.printf("----------------------------------\n");
                        break;
                    } else if (arr1[0][mid] > input) {
                    	high = mid - 1;
                    } else {
                    	low = mid + 1;
                    }
                    count++;
                    System.out.printf("%d, %d\n", low, high);
                }
            }
        }
        System.out.printf("수고하셨습니다 ^^ \n");
    }
}