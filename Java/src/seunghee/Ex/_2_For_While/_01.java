package seunghee.Ex._2_For_While;

public class _01 {
	public static void main(String[] args) {
        
		// While 로 구현한 구구단
		
		int i = 2;
		while (i < 10) {
            System.out.printf("\n %d단 \n", i);
            
            int j = 1;
            while (j < 10){
                System.out.printf("%d x %d = %2d \n",i, j, (i*j));
                j++;
            }
            
            i++;
        }
	}
}
