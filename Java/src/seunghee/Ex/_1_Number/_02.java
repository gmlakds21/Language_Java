package seunghee.Ex._1_Number;

public class _02 {
    public static void main(String[] args) {

    	// Sum = 1 + 2 + 3 + 4 + ... + NUM
    	
        int num = 10;
        int sum = 0;

        for(int i=1; i<=num; i++) {
            sum += i;
        }

        System.out.println("1부터 "+num+"까지의 합은 "+sum+"입니다.");
    }
}
