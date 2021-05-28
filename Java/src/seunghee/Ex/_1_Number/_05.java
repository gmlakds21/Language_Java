package seunghee.Ex._1_Number;

public class _05 {
    public static void main(String[] args) {

    	// Sum = 1/2 + 2/3 + 3/4 + ... + (NUM-1)/NUM
    	
        int num = 10;
        double sum = 0;

        for(int i=1; i<=num; i++) {
            sum += i/(i + 1.0);
        }

        System.out.println(sum);
    }
}
