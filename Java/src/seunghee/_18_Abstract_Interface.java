package seunghee;

public class _18_Abstract_Interface {
	public static void main(String[] args) {
		
		Dog_18 dog = new Dog_18();
		dog.setName("멍멍이");
		dog.setAge(2);
		dog.info(dog.getName(), dog.getAge());
		dog.cry();
		
		System.out.println();
		
		Cat_18 cat = new Cat_18();
		cat.setName("야옹이");
		cat.setAge(3);
		cat.info(cat.getName(), cat.getAge());
		cat.cry();
	}
}

// interface 에서 메소드 먼저 선언
interface Action_18 {
	void info(String name, int age);
	void cry();
}

// abstract class 에서 변수 및 메소드 일부 선언
abstract class Animal_18 implements Action_18 {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public void info(String name, int age) {
		System.out.println("이름 : "+name+"\n나이 : "+age);
	}
}

// class 에서 변환 시킬 부분만 활용
class Dog_18 extends Animal_18 implements Action_18 {
	@Override
	public void cry() {
		System.out.println("멍멍~ 멍멍!");
	}
}

class Cat_18 extends Animal_18 implements Action_18 {
	@Override
	public void cry() {
		System.out.println("야옹~ 야옹!");
	}
}