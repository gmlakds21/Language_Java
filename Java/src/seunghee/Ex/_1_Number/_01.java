package seunghee.Ex._1_Number;

public class _01 {
    public static void main(String[] args) {
    	
    	// Sum = 7 + 7 + 7 + ... + 7

        int num = 10;
        int sum = 0;

        for(int i=1; i<=num; i++) {
            sum += 7;
        }
        
        System.out.println("7을 "+num+"번 더한 값은 "+sum+"입니다.");
    }
}
