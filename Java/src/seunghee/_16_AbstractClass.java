package seunghee;

public class _16_AbstractClass {
	public static void main(String[] args) {
		
		// 추상화 클래스는 객체화 시킬 수 없다.
		// Animal_16 a = new Animal_16();
		
		Dog_16 dog = new Dog_16();
		dog.cry();
		
		Cat_16 cat = new Cat_16();
		cat.cry();
	}
}

abstract class Animal_16 {
	abstract void cry();
}

class Dog_16 extends Animal_16 {
	@Override
	void cry() {
		System.out.println("멍멍~ 멍멍!");
	}
}

class Cat_16 extends Animal_16 {
	@Override
	void cry() {
		System.out.println("야옹~ 야옹!");
	}
}