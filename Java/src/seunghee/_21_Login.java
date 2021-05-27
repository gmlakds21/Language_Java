package seunghee;

import java.util.Scanner;

public class _21_Login {
	public static void main(String[] args) {
		
		User u = new User();
		
		u.newUser(u);
		u.checkUser(u);
	}
}

class User {
	String id;
	String pw;
	
	public User() { }
	
	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	void newUser(User u) {
		Scanner sc = new Scanner(System.in);
		System.out.print("회원가입하실 아이디를 입력해 주세요 : ");
		u.id = sc.nextLine();
		System.out.printf("%s 아이디의 비밀번호를 입력해 주세요 : ", id);
		u.pw = sc.nextLine();
	}
	
	void checkUser(User u) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("아이디를 입력해 주세요 : ");
			String id = sc.nextLine();
			System.out.printf("%s 아이디의 비밀번호를 입력해 주세요 : ", id);
			String pw = sc.nextLine();
			
			if (!(u.id.equals(id))) {
				System.out.println("가입하지 않은 아이디");
			} else if (!(u.pw.equals(pw))){
				System.out.println("비밀번호 틀렸음");
			} else {
				System.out.println("로그인 성공");
			}
			
			System.out.println("취소시 0 입력");
			String check = sc.nextLine();
			if (check.equals("0")) break;
			System.out.print("다시 ");
		}
	}
}