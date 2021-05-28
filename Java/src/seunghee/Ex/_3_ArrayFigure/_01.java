package seunghee.Ex._3_ArrayFigure;

import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {

    	// 직각 삼각형
    	
        Scanner scanner = new Scanner (System.in);
        int order = 1;

        while (true) {
            System.out.print("원하는 삼각형의 크기를 입력해 주세요 : ");
            order = scanner.nextInt();
            if (order == 0) {
                break;
            }
            System.out.print("원하는 삼각형의 형태를 입력해 주세요 : ( 1 ~ 4 )");
            int order2 = scanner.nextInt();

            int[][] Num = new int[order][order];
            int num = 0;

            switch (order2) {
                case 1: // 1번 모양
                    for (int i = 0; i < order; i++) {
                        for (int j = 0; j < (i + 1); j++) {
                            num += 1;
                            Num[i][j] = num;
                        }
                    }
                    break;
                    
                case 2: // 2번 모양
                    for (int i = 0; i < order; i++) {
                        for (int j = order - 1; j > (order - i - 2); j--) {
                            num += 1;
                            Num[i][j] = num;
                        }
                    }
                    break;
                    
                case 3: // 3번 모양
                    for (int i = 0; i < order; i++) {
                        for (int j = 0; j < (order - i); j++) {
                            num += 1;
                            Num[i][j] = num;
                        }
                    }
                    break;
                    
                case 4: // 4번 모양
                    for (int i = 0; i < order; i++) {
                        for (int j = i; j < order; j++) {
                            num += 1;
                            Num[i][j] = num;
                        }
                    }
                    break;
            }
            
            // 도형 출력
            for (int i = 0; i < order; i++) {
                for (int j = 0; j < order; j++) {
                    if (Num[i][j] != 0) {
                        System.out.printf("%2d ", Num[i][j]);
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}