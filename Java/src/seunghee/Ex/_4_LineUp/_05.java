package seunghee.Ex._4_LineUp;

import java.util.Scanner;

public class _05 {
	public static void main(String[] args) {
		
		// 삽입 정렬
		
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("정렬하고자 하는 배열의 크기를 입력해 주세요 : ");
            int order = scanner.nextInt();
            if(order == 0) { break; }

            int [] order2 = new int [order];
            for (int i = 0; i < order2.length; i++) {
                order2[i] = (int)(Math.random()*101);
                System.out.printf("%3d ", order2[i]);
            }
            System.out.println("\n---------------------------");
            
            // 정렬 부분
            int j = 0;
            for (int i = 1; i < order2.length; i++) {
                int k = order2[i];
                for ( j = i-1 ; j >= 0; j--) {
                    if (k < order2[j]) {
                        order2[j+1] = order2[j];
                    } else {
                        break;
                    }
                }
                order2[j+1] = k;
            }
            
            // 출력 부분
            for (int i = 0; i <order2.length; i++) {
                System.out.printf("%3d ", order2[i]);
            }
            System.out.println();
        }
    }
}