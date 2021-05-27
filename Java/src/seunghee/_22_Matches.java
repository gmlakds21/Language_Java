package seunghee;

import java.util.Scanner;

public class _22_Matches {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = 123456789;
		String str1 = String.format("%d", num);
		String str2 = "12345678a";
		
		System.out.println(str1.matches(str2));
		System.out.println("------------");
		System.out.println(str1.matches("[a-z]*"));
		System.out.println(str1.matches("[0-9]*"));
		
		System.out.println("000-0000-0000");
		System.out.print("전화번호를 입력하여 주세요 : ");
		String phone = sc.nextLine();
		String pattern1 = "[0-9]{3}-[0-9]{3,4}-[0-9]{4}";
		System.out.println(phone.matches(pattern1));
		
		System.out.print("영어로 시작하는 아이디를 입력하여 주세요(6 ~ 18자리) : ");
		String id = sc.nextLine();
		String pattern2 = "[a-zA-Z][a-zA-Z0-9!]{5,17}";
		System.out.println(id.matches(pattern2));
	}
}
