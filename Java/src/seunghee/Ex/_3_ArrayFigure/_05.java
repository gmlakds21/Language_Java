package seunghee.Ex._3_ArrayFigure;

import java.util.Scanner;

public class _05 {
	public static void main(String[] args) {

		// 달팽이 case 4
		
        Scanner scanner = new Scanner (System.in);
        while (true) {
            System.out.print("원하는 달팽이 모양의 크기를 입력해 주세요 : ");
            int order = scanner.nextInt();
            if (order == 0) { break; }

            int order2 = 2*order;
            int [][] Num = new int [order2][order2];
            int num = 0;

            int direct = 0;
            int count = 0;
            int i = 0, j = 0;
            
            // 입력 부분
            while (count != order) {
                switch (direct%4) {
                
                    case 0 :
                        i = count;
                        for ( j = count; j <(order2-count-1); j++) {
                            num++;
                            Num[i][j] = num;
                        }
                        direct++;
                        break;
                        
                    case 1 :
                        j = (order2-count-1);
                        for ( i = count; i < (order2-count-1); i++) {
                            num++;
                            Num[i][j] = num;
                        }
                        direct++;
                        break;
                        
                    case 2 :
                        i = (order2-count-1);
                        for ( j = (order2-count-1); j > count; j--) {
                            num++;
                            Num[i][j] = num;
                        }
                        direct++;
                        break;
                        
                    case 3 :
                        j = count;
                        for ( i = (order2-count-1); i > count; i--) {
                            num++;
                            Num[i][j] = num;
                        }
                        direct++;
                        break;
                }
                count = direct/4;
            }
            
            // 출력 부분
            for ( i = 0; i < order2; i++) {
                for ( j = 0; j <order2; j++) {
                    if (Num[i][j] == 0) {
                    	System.out.print("   ");
                    } else {
                    	System.out.printf("%2d ",Num[i][j]);
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}