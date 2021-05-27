package seunghee;

public class _13_Extends {
	public static void main(String[] args) {
		
		Student sp = new Student();
		Worker wp = new Worker();
		Researcher rp = new Researcher();
		Professor pp = new Professor();
		
		System.out.println(sp.speak());
		System.out.println(sp.study());
		System.out.println();

		System.out.println(wp.eat());
		System.out.println(wp.work());
		System.out.println();
		
		System.out.println(rp.walk());
		System.out.println(rp.research());
		System.out.println();
		
		System.out.println(pp.sleep());
		System.out.println(pp.teach());
		System.out.println();
	}
}

class Person_13 {
	public String speak() { return "말하는 중"; }
	public String eat() { return "먹는 중"; }
	public String walk() { return "걷는 중"; }
	public String sleep() { return "자는 중"; }
}

class Student extends Person_13 {
	public String study() { return "공부하는 중"; }
}

class Worker extends Person_13 {
	public String work() { return "일하는 중"; }
}

class Researcher extends Person_13 {
	public String research() { return "연구하는 중"; }
}

class Professor extends Person_13 {
	public String teach() { return "가르치는 중"; }
}

