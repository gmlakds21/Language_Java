package seunghee.Ex._1_Number;

public class _06 {
	public static void main(String[] args) {

        int num = 10;
        int sum = 0;
        int j = 2;

        for (int i=1; i<=num; i++) {
            j += (i-1);
            sum += j;
        }
        
        System.out.println(sum);
    }
}
