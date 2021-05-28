package seunghee.Ex._4_LineUp;

import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {

		// 순위 석차
		
        while(true) {
            Scanner scanner = new Scanner (System.in);
            System.out.print("정렬하고자 하는 배열긔 크기를 입력해 주세요 : ");
            int order = scanner.nextInt();
            if (order == 0) { break; }

            int [] order2 = new int [order];
            for (int i = 0; i < order2.length; i++) {
                order2[i] = (int)(Math.random()*101);
                System.out.printf("%3d ", order2[i]);
            }
            System.out.println("");

            int [] rank = new int [order];
            for (int i = 0; i < order2.length; i++) {
                rank[i] = 0;
                System.out.printf("%3d ", rank[i]);
            }
            System.out.println("\n-------------------------");
            
            // 정렬 부분
            int sw = 0;
            for (int i = 0; i < order2.length; i++) {
                for (int j = i; j < order2.length; j++) {
                    if(order2[i] >= order2[j]) {
                    	rank[j]++;
                    } else {
                    	rank[i]++;
                    }
                }
            }
            
            // 출력 부분
            for (int i = 0; i < order2.length; i++) {
                System.out.printf("%3d ", order2[i]);
            }
            System.out.println("");

            for (int i = 0; i < order2.length; i++) {
                System.out.printf("%3d ", rank[i]);
            }
            System.out.println("");
        }
    }
}