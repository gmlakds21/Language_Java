package seunghee.Ex._3_ArrayFigure;

import java.util.Scanner;

public class _08 {
	public static void main(String[] args) {

		// 마방진
		
        Scanner scanner = new Scanner (System.in);

        while (true) {
            System.out.print("원하는 마방진의 크기를 입력해 주세요 : ");
            int order = scanner.nextInt();
            if (order == 0) { break; }
            int order2 = 2*order;

            int Num[][] = new int [order2][order2];
            int num = 0;

            // 입력 부분
            int m = order-1;
            int n = 0;
            for (int times1 = 0; times1 < order; times1 ++) {
                for (int times2 = 0; times2 < order; times2 ++) {
                    num++;
                    Num[m][n] = num;
                    m -= 1;
                    n += 1;
                }
                m += ( order + 1 );
                n -= ( order - 1 );
            }

            // 출력 부분
            for (int i = 0; i < order2; i++) {
                for (int j = 0; j <order2; j++) {
                    if (Num[i][j] == 0) {
                    	System.out.print("   ");
                    } else {
                    	System.out.printf("%2d ",Num[i][j]);
                    }
                }
                System.out.println("");
            }
            
            // 회전 부분
            for (int i = 0; i < order2; i++) {
                for (int j = 0; j < order2; j++) {
                    if (Num[i][j] != 0 ) {
                        if ((i < order/2 ) || ( i > (order/2)+(order-1))) {
                            Num[(i+order)%order2][j] = Num[i][j];
                            Num[i][j] = 0;
                        }
                        if ((j < order/2 ) || ( j > (order/2)+(order-1))) {
                            Num[i][(j+order)%order2] = Num[i][j];
                            Num[i][j] = 0;
                        }
                    }
                }
            }
            
            // 더한 값 계산
            int sum = 0;
            for (int i = 0; i < order2; i++) {
                sum = 0;
                for (int j = 0; j <order2; j++) {
                    if (Num[i][j] == 0) {
                    	System.out.print("   ");
                    } else {
                    	System.out.printf("%2d ",Num[i][j]);
                    }
                    sum += Num[i][j];
                }
                System.out.println(sum);
            }
            
            //
            int [][] Num2 = new int [order2][order2];
            for (int i = 0; i < Num2.length; i++) {
                for (int j = 0; j < Num2[i].length; j++) {
                    Num2[j][(order2-1)-(i)] = Num[i][j];
                }
            }
            
            //
            sum = 0;
            for (int i = 0; i < order2; i++) {
                sum = 0;
                for (int j = 0; j <order2; j++) {
                    if (Num2[i][j] == 0) {
                    	System.out.print("   ");
                	} else {
                		System.out.printf("%2d ",Num2[i][j]);
                	}
                    sum += Num2[i][j];
                }
                System.out.println(sum);
            }
        }
    }
}