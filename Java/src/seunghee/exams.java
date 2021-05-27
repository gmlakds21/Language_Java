package seunghee;

public class exams {
	public static void main() {
		
	}
}

// Countable 추상 클래스
abstract class Countable {
	protected String name;
	protected int num;
	
	// 매개변수 2개의 생성자 생성
	Countable (String name , int num) {
		this.name = name;
		this.num = num;
	}
	
	// 구체적 메소드 선언
	void count() {
		System.out.println(name+"가 "+num+"마리 있다.");
	}
}

class Bird extends Countable {

	// 생성자 재선언 super() 메소드는 부모 클래스의 메소드 동일하게 실행할 거라는 설명
	Bird(String name, int num) {
		super(name, num);
	}

	// abstract 메소드의 몸체선언
	// 만약 abstract 클래스에서 메소드의 몸체 까지 선언했을시
	// 추가 Override 안해줘도 됩니다.
	/*	@Override
		void count() {
			System.out.printf(name+"가 "+num+"마리 있다.");
		}
	*/
	
	// Countable 클래스에는 없던 메소드라 Override 없이
	// 일반 메소드 처럼 선언
	public void fly() {
		System.out.println(num+"마리 "+name+"가 날아간다.");
	}
}

class Tree extends Countable {
	
	Tree(String name, int num) {
		super(name, num);
	}

	@Override
	void count() {
		System.out.printf(name+"가 "+num+"그루 있다.");
	}
	
	public void repen() {
		System.out.println(num+"그루 "+name+"에 열매가 잘 익었다.");
	}
}
