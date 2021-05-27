package seunghee;

public class _15_Overriding {
	public static void main(String[] args) {
		
		Animal_15 animal = new Animal_15();
		animal.cry();
		
		Dog_15 dog = new Dog_15();
		dog.cry();
		
		Cat_15 cat = new Cat_15();
		cat.cry();
		
	}
}

class Animal_15 {
	void cry() {
		System.out.println("동물이 웁니다.");
	}
}

class Dog_15 extends Animal_15 {
	@Override
	void cry() {
		System.out.println("멍멍~ 멍멍!");
	}
}

class Cat_15 extends Animal_15 {
	@Override
	void cry() {
		System.out.println("야옹~ 야옹!");
	}
}