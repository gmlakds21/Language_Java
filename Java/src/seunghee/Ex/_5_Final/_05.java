package seunghee.Ex._5_Final;

import java.util.Scanner;

public class _05 {
	public static void main(String[] args) {
		
		// 로또 당첨 번호 직접 입력
		Scanner scanner = new Scanner(System.in);
        int []RealList = new int [6];

        for (int i = 0; i <RealList.length; i++) {
            System.out.print((i+1)+"번째 번호를 입력해주세요 : ");
            RealList[i] = scanner.nextInt();

            if (RealList[i] < 1 || RealList[i] >45) {
                i--;
                System.out.print(" 1과 45 사이의 값을 입력해주세요 \n");
            }

            for (int j = 0; j < i; j++ ) {
                if (RealList[i] == RealList[j]) {
                    System.out.print("중복된 번호는 입력되어서는 안됩니다. \n");
                    i--;
                }
            }
        }

        // 로또 보너스 번호 입력
        int check = 0;
        int BonusNum = 0;
        while (check < 6) {
            check = 0;
            BonusNum = (int)(Math.random()*45) +1 ;
            for (int i = 0; i < 6; i++ ) {
                if (RealList[i] != BonusNum) {
                	check++;
                }
            }
        }

        // 로또 번호 생성
        int [] NumList = new int [6];
        int times = 0;
        while (times < 6) {
            int Num = (int)(Math.random()*45) +1 ;
            int i = 0;
            while (i < NumList.length) {
                if (NumList[i] == Num) {
                	continue;
                }
                i++;
            }
            NumList[times] = Num;
            times++;
        }

        // 로또 번호 정렬
        for (int i = 0; i < NumList.length; i++) {
            for (int j = i + 1; j < NumList.length; j++) {
                if ( NumList[i] > NumList[j] ) {
                    times = NumList[i];
                    NumList[i] = NumList[j];
                    NumList[j] = times;
                }
            }
        }

        // 로또 번호 확인
        System.out.print("당첨 번호는 { ");
        for (int i = 0; i<6; i++) {
            System.out.print(RealList[i]+" ");
        }
        System.out.printf("} 보너스 번호는 %2d입니다.\n", BonusNum);

        System.out.print("추첨된 번호는 { ");
        for (int i = 0; i<6; i++) {
            System.out.print(NumList[i]+" ");
        }
        System.out.print("} 입니다. \n");

        // 로또 번호 대조
        int count = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if(RealList[i]==NumList[j]) {
                	count++;
                }
            }
        }

        // 보너스 번호 대조
        int Bcount = 0;
        for ( int i = 0; i <6; i++) {
            if (BonusNum == NumList[i]) {
            	Bcount++;
            }
        }
        
        // 로또 결과 발표
        switch(count) {
            case 6 : System.out.printf("%2d개 맞추셨습니다. 1등 입니다.",count); break;
            case 5 :
            	if(Bcount != 0) {
            		System.out.printf("%2d개, 보너스 번호를 맞추셨습니다. 2등 입니다.",count);
            		break;
            	} else {
            		System.out.printf("%2d개 맞추셨습니다. 3등 입니다.",count);
            		break;
            	}
            case 4 : System.out.printf("%2d개 맞추셨습니다. 4등 입니다.",count); break;
            case 3 : System.out.printf("%2d개 맞추셨습니다. 5등 입니다.",count); break;
            default : System.out.printf("%2d개 맞추셨습니다. 꽝 입니다.",count); break;
        }
    }
}