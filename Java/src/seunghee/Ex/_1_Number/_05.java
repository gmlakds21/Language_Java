package seunghee.Ex._1_Number;

public class _05 {
    public static void main(String[] args) {

        int num = 10;
        double sum = 0;

        for(int i=1; i<=num; i++) {
            sum += i/(i + 1.0);
        }

        System.out.println(sum);
    }
}
