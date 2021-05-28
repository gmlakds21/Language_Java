package seunghee.Ex._5_Final;

import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		
		// 물건 구매
		
        int A = 300;
        int B = 400;
        int C = 500;

        System.out.printf("A 물건의 개당가격은 %4d 입니다.\n", A);
        System.out.printf("B 물건의 개당가격은 %4d 입니다.\n", B);
        System.out.printf("C 물건의 개당가격은 %4d 입니다.\n", C);
        System.out.print("\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("가지고 있는 돈을 입력해 주세요 : ");
        int Money = scanner.nextInt();

        int Ag = Money/A;
        int Bg = Money/B;
        int Cg = Money/C;

        int [][][] goods = new int [Ag+1][Bg+1][Cg+1];

        // 계산 부분
        for ( int i = 0; i <= Ag; i++) {
            for (int j = 0; j <= Bg; j++) {
                for (int k = 0; k <= Cg; k++) {
                    if ((i+j+k) == 0) {
                    	continue;
                    }
                    if (Money - (i*A) - (j*B) - (k*C) >= 0) {
                    	goods[i][j][k] = 1;
                    }
                }
            }
        }
        
        // 출력 부분
        System.out.printf("돈을 모두 사용하여 구매할 수 있는 모든 경우의 수는 \n");
        for ( int i = 0; i <= Ag; i++) {
            for (int j = 0; j <= Bg; j++) {
                for (int k = 0; k <= Cg; k++) {
                    if (goods[i][j][k] == 1) {
                        if ((Money - (i*A) - (j*B) - (k*C)) == 0 ) {
                            System.out.printf("(%2d, %2d, %2d)   %4d\n",i ,j ,k ,(Money - (i*A) - (j*B) - (k*C)));
                        }
                    }
                }
            }
        }
    }
}