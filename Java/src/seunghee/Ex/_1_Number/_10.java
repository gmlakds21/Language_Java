package seunghee.Ex._1_Number;

public class _10 {
    public static void main(String[] args) {

    	// Sum = 1! + 2! + 3! + ... + NUM!
    	
        int num = 10;
        int sum = 0;

        int j = 1;

        for (int i=1; i<=num; i++){
            j *= i;
            sum += j;
        }
        
        System.out.println(sum);
    }
}