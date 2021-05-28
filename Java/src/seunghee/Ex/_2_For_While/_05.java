package seunghee.Ex._2_For_While;

public class _05 {
    public static void main(String[] args) {

        int i = 0;
        int j = 7;

        System.out.println("            달력 \n");

        for (i=1; i<=(35); i++) {
            if ((i-4)<=0) {
            	System.out.print("    ");
            } else {
            	System.out.printf("%4d",(i-4));
            }

            if(i%j==0) {
            	System.out.println("");
            }
        }
    }
}