package seunghee;

public class _19_OOP_Casting {
	public static void main(String[] args) {
	
		// UpCasting 자식 -> 부모 
		Animal_19 animal1 = new Dog_19();
		
		// DownCastion 부모 -> 자식
		// Dog_19 dog2 = (Dog_19) new Animal_19();
		// 불가능. 원래 Dog 만 Dog 로 만들 수 있다.
		Dog_19 dog1 = (Dog_19) animal1;
		
		dog1.cry();
		System.out.println(dog1.getName());
	}
}

interface Action_19 {
	void info(String name, int age);
	void cry();
}

// 추상 메소드는 객체를 만들 수 없다.
class Animal_19 implements Action_19 {
	private String name ="동물";
	private int age = 2;
	
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
	
	@Override
	public void cry() { }
}

class Dog_19 extends Animal_19 implements Action_19 {
	private String name = "강아지";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void cry() {
		System.out.println("멍멍~ 멍멍!");
	}
}

class Cat_19 extends Animal_19 implements Action_19 {
	private String name = "고양이";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void cry() {
		System.out.println("야옹~ 야옹!");
	}
}