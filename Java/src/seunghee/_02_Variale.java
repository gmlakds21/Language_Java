package seunghee;

public class _02_Variale {
	public static void main(String[] args) {
		
		int iNum = 10;
		System.out.println(iNum);
		
		short sNum = 10;
		byte bNum = 20;
		System.out.println(sNum + bNum);
		
		int lNum1 = 123456789;
		long lNum2 = 123456789L;
		long lNum3 = 123456789; // 이경우 자동으로 int 로 변환됨
		System.out.println(lNum1);
		System.out.println(lNum2);
		System.out.println(lNum3);
		
	}
}
