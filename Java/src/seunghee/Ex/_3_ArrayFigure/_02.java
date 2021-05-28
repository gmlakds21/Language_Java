package seunghee.Ex._3_ArrayFigure;

import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {

    	// 모래시계 출력
    	
        System.out.print("원하는 모래시계의 크기를 입력해 주세요 : ");

        Scanner scanner = new Scanner(System.in);
        int order = scanner.nextInt();
        int order2 = order*2-1;
        int num = 0;
        int [ ][ ] Num = new int [order2+1][order2];

        for (int i = 0; i < order2+1; i++) {
            if (i <= order) {
                for (int j = i; j < (order2-i); j++) {
                    num++;
                    Num[i][j] = num;
                }
            } else {
                for (int j = (order2-i); j < i; j++) {
                    num++;
                    Num[i][j] = num;
                }
            }
        }
        
        // 출력 부분
        System.out.println("");
        for (int i = 0; i < order2+1; i++)
        {
            for (int j = 0; j <order2; j++)
            {
                if (Num[i][j] == 0)
                { System.out.print("   "); }
                else
                { System.out.printf("%2d ",Num[i][j]); }
            }
            System.out.println("");
        }
    }
}
