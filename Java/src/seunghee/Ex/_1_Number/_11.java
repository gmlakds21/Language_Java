package seunghee.Ex._1_Number;

public class _11 {
    public static void main(String[] args) {

    	// Sum= (1*10) + (2*9) + (3*8) + ... + (10*1)
    	
        int num = 10;
        int sum = 0;

        for (int i=1; i<=num; i++) {
            sum += i * (11-i);
        }
        
        System.out.println(sum);
    }
}