package seunghee;

public class _17_Interface {
	public static void main(String[] args) {

		Dog_17 dog = new Dog_17();
		dog.cry();
		
		Cat_17 cat = new Cat_17();
		cat.cry();
	}
}

interface AnimalAction {
	void cry();
}

class Dog_17 implements AnimalAction {
	@Override
	public void cry() {
		System.out.println("멍멍~ 멍멍!");
	}
}

class Cat_17 implements AnimalAction {
	@Override
	public void cry() {
		System.out.println("야옹~ 야옹!");
	}
}