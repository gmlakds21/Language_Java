package seunghee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

public class _23_ArrayList {
	public static void main(String[] args) {
		
		// 기본형
		ArrayList<Integer> iList = new ArrayList<Integer>();
		// ArrayList<Integer> iList = (ArrayList<Integer>) Arrays.stream(iArr).boxed().collect(Collectors.toList());
		// 약식
		ArrayList<String> sList = new ArrayList<>();
		// 정적 배열 - 동적 배열
		Person[] voArr = {
				new Person("김연아", 20),
				new Person("유재석", 25)};
		ArrayList<Person> voList = new ArrayList<>(Arrays.asList(voArr));
		
		System.out.println("크기");
		System.out.println(iList.size());
		System.out.println(sList.size());
		System.out.println(voList.size());
		System.out.println();
		
		// 추가
		iList.add(12);
		iList.add(20);
		iList.add(245);
		sList.add("Hello");
		sList.add("Hi");
		sList.add("Nice");
		voList.add(new Person("하하", 30));
		
		// 위치 지정 추가
		iList.add(1, 24);
		voList.add(2, new Person("전소민", 20));
		
		// 추출
		System.out.println(iList.get(1));
		System.out.println(sList.get(2));
		System.out.println(voList.get(2).name);
		
		System.out.println(iList.contains(20));
		System.out.println(sList.contains("Hi"));
		
		System.out.println(iList.indexOf(20));
		System.out.println(sList.indexOf("Hi"));
		// voList 의 indexOf
		for(int i=0; i<voList.size(); i++) {
			if(voList.get(i).name.equals("유재석")) {
				System.out.println(i);
			}
		}
		System.out.println();
		
		// 수정
		iList.set(1,  23);
		sList.set(2,  "Nice!");
		voList.set(2, new Person("이광수", 25));
		System.out.println(iList.get(1));
		System.out.println(sList.get(2));
		System.out.println(voList.get(2).name);
		System.out.println();
		
		// 출력
		for(Integer num : iList) {
			System.out.println(num);
		}
		for(Person vo : voList) {
			System.out.println(vo.name);
		}
		Iterator<Integer> iIter = iList.iterator();
		while(iIter.hasNext()) {
			int num = iIter.next();
			System.out.println(num);
		}
		Iterator<Person> voIter = voList.iterator();
		while(voIter.hasNext()) {
			Person vo = voIter.next();
			System.out.println(vo.name);
		}
		System.out.println();
		
		// 제거
		iList.remove(1);
		sList.remove(2);
		voList.remove(2);
		System.out.println(iList.get(1));
		System.out.println(sList.get(1));
		System.out.println(voList.get(2).name);
		System.out.println();
		
		// 전체 제거
		iList.clear();
		sList.clear();
		voList.clear();
		System.out.println(iList.size());
		System.out.println(sList.size());
		System.out.println(voList.size());
	}
}

class Person_23 {
	String name;
	int age;
		
	public Person_23(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}