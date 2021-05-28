package seunghee.Ex._3_ArrayFigure;

import java.util.Scanner;

public class _09 {
	public static void main(String[] args) {

		// 대각선
		
        while (true) {
            Scanner scanner = new Scanner (System.in);
            System.out.print("원하는 도형의 크기를 입력하세요 : ");
            int order = scanner.nextInt();
            if (order == 0 ) { break; }

            int [][] Num = new int [order][order];
            int num = 0;
            int i = 0;
            int j = 0;
            
            // 입력 부분
            for (int times1 = 0; times1 < order; times1++) {
                i = times1;
                j = 0;
                for (int times2 = 0; times2 < (times1+1); times2++) {
                    num++;
                    Num[i][j] = num;
                    i--;
                    j++;
                }
            }
            
            // 나머지 입력 부분
            for (int times1 = 1; times1 < order; times1++) {
                i = (order - 1);
                j = times1;
                for (int times2 = 0; (times2 < (order-times1)); times2++) {
                    num++;
                    Num[i][j] = num;
                    i--;
                    j++;
                }
            }
            
        	// 출력부분
            for (int m = 0; m < order; m++) {
                for (int n = 0; n <order; n++) {
                    if (Num[m][n] == 0) {
                    	System.out.print("   ");
                    } else {
                    	System.out.printf("%2d ",Num[m][n]);
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}