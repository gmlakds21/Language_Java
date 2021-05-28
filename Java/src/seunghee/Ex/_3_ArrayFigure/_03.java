package seunghee.Ex._3_ArrayFigure;

import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {

		// 마름모

		Scanner scanner = new Scanner(System.in);
        System.out.print("원하는 마름모의 크기를 입력해 주세요 : ");
        int order = scanner.nextInt();
        int order2 = 2*order-1;
        int num = 0;

        int [ ][ ] Num = new int[order2+1][order2] ;

        for (int i = 0; i < (order2+1); i++) {
            if (i <= order) {
                for (int j = (order-i) ; j < (i+order)-1 ; j++) {
                    num++;
                    Num[i][j] = num;
                }
            } else {
                for (int j = (i-order); j < (3*order-i)-1; j++) {
                    num++;
                    Num[i][j] = num;
                }
            }
        }
        
        // 출력 부분
        System.out.println("");
        for (int i = 0; i < order2+1; i++) {
            for (int j = 0; j <order2; j++) {
                if (Num[i][j] == 0) { 
                	System.out.print("   ");
                } else {
                	System.out.printf("%2d ",Num[i][j]);
                }
            }
            System.out.println("");
        }
    }
}