package seunghee.Ex._1_Number;

public class _07 {
    public static void main(String[] args) {

    	// Sum = 1 + 2 + 4 + 7 + ... + NUM
    	
        int num = 10;
        int sum = 0;
        int j = 1;

        for (int i=1; i<=num; i++) {
            j += (i-1);
            sum += j;
        }

        System.out.println(sum);
    }
}