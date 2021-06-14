package seunghee;

public class _11_ObjectOrientedPrograming {
	public static void main(String[] args) {
		
		Person_11 o1 = new Person_11("최승희", "의사", 45, "여", "A");
		Person_11 o2 = new Person_11("이미녀", "골프선수", 28, "여", "O");
		Person_11 o3 = new Person_11("김미남", "교수", 47, "남", "AB");
		Person_11 o4 = new Person_11();
		
		o1.PersonPrint(o1);
		o2.PersonPrint(o2);
		o3.PersonPrint(o3);
		o4.PersonPrint(o4);
		
	}
}

class Person_11 {
	
	String name;
	String job;
	int age;
	String gender;
	String blood;
	
	public Person_11() {
		name = "홍길동";
		job = "무사";
		age = 18;
		gender = "남";
		blood = "O";
	}
	
	public Person_11(String name, String job, int age, String gender, String blood) {
		this.name = name;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.blood = blood;
	}
	
	public void PersonPrint(Person_11 p) {
		System.out.printf("name : %s\njob : %s\nage : %d\ngender : %s\nblood : %s\n\n", p.name, p.job, p.age, p.gender, p.blood);
	}
}
