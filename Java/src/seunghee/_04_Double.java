package seunghee;

public class _04_Double {
	public static void main(String[] args) {
		
		/* Double1 */ {
			double dnum = 3.14;
			float fnum = 3.14F;
			
			System.out.println(dnum);
			System.out.println(fnum);
		}
		/* Double2 */ {
			double dnum = 1;
			
			for(int i=0; i < 10000; i++) {
				dnum = dnum + 0.1;
			}
			System.out.println(dnum);
		}
	}
}
