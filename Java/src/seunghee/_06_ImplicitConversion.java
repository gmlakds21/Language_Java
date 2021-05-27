package seunghee;

public class _06_ImplicitConversion {
	public static void main(String[] args) {
		
		// 묵시적 형변환
		byte bNum = 10;
		int iNum = bNum;
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);

		// 명시적 형변환
		System.out.println();
		
		int iNum3 = 10;
		byte bNum2 = (byte)iNum3;
		System.out.println(bNum2);
		
		double dNum2 = 3.14;
		int iNum4 = (int)dNum2;
		System.out.println(iNum4);	
	}
}
