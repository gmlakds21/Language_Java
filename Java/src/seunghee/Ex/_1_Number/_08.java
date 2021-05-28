package seunghee.Ex._1_Number;

public class _08 {
    public static void main(String[] args) {

    	// Sum = 1 + 3 + 6 + 10 + ... + NUM
    	
        int num = 10;
        int sum1 = 0;
        int sum2 = 0;

        for (int i=1; i<=num; i++) {
            sum1 += i;
            sum2 += sum1;
        }
        
        System.out.println(sum2);
    }
}