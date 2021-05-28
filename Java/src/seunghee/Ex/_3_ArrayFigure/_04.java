package seunghee.Ex._3_ArrayFigure;

import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {

		// ㄹ 모양
		
		Scanner scanner = new Scanner (System.in);
        System.out.print("원하는 도형의 크기를 입력하세요 : ");
        int order = scanner.nextInt();
        int order2 = 2*order+1;

        int [][] Num = new int [order2+1][order2] ;
        int num = 0;
        int j = 0;
        int a = 1;
        
        // 입력 부분
        for ( int i = 0; i < order2; i++ ) {
            for(int cnt = 0; cnt < order2; cnt++) {
                num++;
                Num[i][j] = num;
                j += a;
            }
            j -= a;
            a = -a;
        }
        
        // 출력 부분
        System.out.println("");
        for (int i = 0; i < order2+1; i++) {
            for (j = 0; j <order2; j++) {
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