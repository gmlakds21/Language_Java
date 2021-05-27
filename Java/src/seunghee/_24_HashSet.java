package seunghee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _24_HashSet {
	public static void main(String[] args) {
		// 기본형
		HashSet<Integer> iSet = new HashSet<Integer>();
		// 약식
		HashSet<String> sSet = new HashSet<>();
		// 정적 배열 - 동적 배열
		Person[] voArr = {
				new Person("김연아", 20),
				new Person("유재석", 25)};
		HashSet<Person> voSet = new HashSet<>(Arrays.asList(voArr));
		
		System.out.println("크기");
		System.out.println(iSet.size());
		System.out.println(sSet.size());
		System.out.println(voSet.size());
		System.out.println();
		
		// 추가
		iSet.add(12);
		iSet.add(20);
		iSet.add(245);
		sSet.add("Hello");
		sSet.add("Hi");
		sSet.add("Nice");
		voSet.add(new Person("하하", 30));

		// 수정
		// 보통은 remove 이후 add
		Iterator<Person> iter1 = voSet.iterator();
		while(iter1.hasNext()) {
			Person vo = iter1.next();
			if(vo.name.equals("유재석")) {
				vo.name = "무재식";
			}
		}
		
		// 추출
		System.out.println(iSet.contains(20));
		System.out.println(sSet.contains("Hi"));
		System.out.println();
		
		// 출력
		for(Integer num : iSet) {
			System.out.println(num);
		}
		for(Person vo : voSet) {
			System.out.println(vo.name);
		}
		Iterator<Integer> iIter = iSet.iterator();
		while(iIter.hasNext()) {
			int num = iIter.next();
			System.out.println(num);
		}
		Iterator<Person> voIter = voSet.iterator();
		while(voIter.hasNext()) {
			Person vo = voIter.next();
			System.out.println(vo.name);
		}
		System.out.println();
		
		// 제거
		iSet.remove(20);
		sSet.remove("Hi");
		Iterator<Person> iter2 = voSet.iterator();
		while(iter2.hasNext()) {
			Person vo = iter2.next();
			if(vo.name.equals("유재석")) {
				voSet.remove(vo);
			}
		}	
		
		System.out.println(iSet.contains(20));
		System.out.println(sSet.contains("Hi"));
		
		// 전체 제거
		iSet.clear();
		sSet.clear();
		voSet.clear();
		System.out.println(iSet.size());
		System.out.println(sSet.size());
		System.out.println(voSet.size());
	}
}

class Person_24 {
	String name;
	int age;
		
	public Person_24(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
