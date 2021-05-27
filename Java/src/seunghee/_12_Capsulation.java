package seunghee;

public class _12_Capsulation {
	public static void main(String[] args) {
		
		Person_12 p = new Person_12();
		p.setPerson("홍길동", "무사", 18, "남", "0");
		
		System.out.println("변수별 출력");
		System.out.println("name : "+p.getName());
		System.out.println("job : "+p.getJob());
		System.out.println("age : "+p.getAge());
		System.out.println("gender : "+p.getGender());
		System.out.println("blood : "+p.getBlood());
		System.out.println();
		
		p.setName("놀부");
		p.setJob("부대찌개");
		p.setAge(40);
		p.setGender("남");
		p.setBlood("AB");
		
		System.out.println("메소드를 이용한 출력");
		p.getPerson();
	}
}

class Person_12 {
	
	private String name;
	private String job;
	private int age;
	private String gender;
	private String blood;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	
	void setPerson( String name, String job, int age, String gender, String blood) {
		this.name = name;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.blood = blood;
	}
	
	void getPerson() {
		System.out.printf("name : %s\njob : %s\nage : %d\ngender : %s\nblood : %s\n\n", name, job, age, gender, blood);
	}
	
}
