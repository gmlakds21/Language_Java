package seunghee;

public class _04_Double {
	public static void main(String[] args) {
		
		double dNum = 3.14;
		float fNum = 3.14F;
		System.out.println(dNum);
		System.out.println(fNum);

		double num = 1;
		for(int i=0; i < 10000; i++) {
			num = num + 0.1;
		}
		System.out.println(num);
	}
}