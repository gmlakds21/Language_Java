package seunghee.Ex._1_Number;

public class _04 {
	public static void main(String[] args) {

		// Sum = 1/2 + 1/3 + 1/4 + ... + 1/NUM
		
        int num = 10;
        double sum = 0;

        for(int i=1; i<=num; i++) {
            sum += 1/(i + 1.0);
        }

        System.out.println(sum);
    }
}
