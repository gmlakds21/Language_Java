package seunghee.Ex._3_ArrayFigure;

import java.util.Scanner;

public class _07 {
	public static void main(String[] args) {

		// 달팽이 case 1
		
        Scanner scanner = new Scanner (System.in);

        while (true) {
            System.out.print("원하는 도형의 크기를 입력해 주세요 : ");
            int order = scanner.nextInt();
            if (order == 0) { break; }

            int order2 = 2 * order;
            int[][] Num = new int[order2][order2];
            int num = 0;

            int direct = 0;
            int count = 0;

            int i = 0, j = 0;
            int sw = 1;
            int sw2 = 0;

            // 입력 부분
            while (count < order) {
                count = (direct / 4);

                for (int times = count; times < order2 - 1 - count; times++) {
                    num++;
                    Num[i][j] = num;
                    j += sw;
                }
                System.out.println("");
                direct++;
                sw = j;
                j = (order2 - 1) - i;
                i = sw;

                if (direct % 2 == 0) {
                    sw = -sw;
                }

                if (direct % 4 == 0) {
                    i += 1;
                    j += 1;
                }
            }

            // 출력부분
            for (i = 0; i < order2; i++) {
                for (j = 0; j < order2; j++) {
                    if (Num[i][j] == 0) {
                        System.out.print("   ");
                    } else {
                        System.out.printf("%2d ", Num[i][j]);
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}