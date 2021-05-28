package seunghee.Ex._2_For_While;

public class _04 {
    public static void main(String[] args) {

    	// 정사각형 출력
    	
        int i = 0;
        int j = 7;

        for (i=1; i<=(j*j); i++) {
            System.out.printf("%2d ",i);
            if(i%j==0) {
            	System.out.println(" ");
            }
        }
    }
}