package seunghee.Ex._4_LineUp;

import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {

		// 선택 정렬 2
		
        while(true) {
            Scanner scanner = new Scanner (System.in);
            System.out.print("정렬하고자 하는 배열의 크기를 입력해 주세요 : ");
            int order = scanner.nextInt();
            if (order == 0) { break; }
            
            int [] order2 = new int [order];
            for (int i = 0; i < order2.length; i++) {
                order2[i] = (int)(Math.random()*101);
                System.out.printf("%3d ", order2[i]);
            }
            System.out.println("");
            
            // 정렬 부분
            int sw = 0;
            for (int i = 0; i < order2.length-1; i++) {
                int k = i;
                for (int j = (i+1); j < order2.length; j++) {
                    if(order2[k] > order2[j]) {
                    	k = j;
                    }
                }
                sw = order2[i];
                order2[i] = order2[k];
                order2[k] = sw;
            }

            // 출력 부분
            for (int i = 0; i < order2.length; i++) {
                System.out.printf("%3d ", order2[i]);
            }
            System.out.println("");
        }
    }
}