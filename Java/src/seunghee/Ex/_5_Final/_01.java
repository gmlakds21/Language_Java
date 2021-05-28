package seunghee.Ex._5_Final;

import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {

		// 이분법
		
        Scanner scanner = new Scanner (System.in);

        while (true) {
            System.out.print("찾고자 하는 숫자를 입력해 주세요 : (0~100) ");
            int KEY = scanner.nextInt();
            if (KEY == 0) { break; }

            int [] Num = new int[101];
            for (int i = 0; i < Num.length; i++) {
            	Num[i] = i;
            }

            int finder = 0;
            int count = Num.length/2;
            int target = 0;
            int i = 0;
            while ( count != 0) {
                for ( i = finder; i <= (finder + count); i++) {
                	if (Num[i] == KEY) {
                		target ++;
                	}
                }

                if ( target == 0 ) {
                	finder += count;
                }
                count /= 2;
                target = 0;
            }
            System.out.println (i+"\n"); break;
        }
    }
}