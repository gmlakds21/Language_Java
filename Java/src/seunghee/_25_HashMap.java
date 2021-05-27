package seunghee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class _25_HashMap {
	public static void main(String[] args) {
		// 기본형
		HashMap<Integer, Integer> iMap = new HashMap<Integer, Integer>();
		// 약식
		HashMap<String, String> sMap = new HashMap<>();
		HashMap<Integer, Person> voMap = new HashMap<>();
		
		System.out.println("크기");
		System.out.println(iMap.size());
		System.out.println(sMap.size());
		System.out.println(voMap.size());
		System.out.println();
		
		// 추가
		iMap.put(1, 12);
		iMap.put(2, 20);
		iMap.put(3, 245);
		sMap.put("moring", "Hello");
		sMap.put("evening", "Hi");
		sMap.put("meet", "Nice");
		voMap.put(3, new Person("하하", 30));

		// 수정
		iMap.replace(1,24);
		sMap.replace("meet", "Happy");
		voMap.replace(3, new Person("하하", 20));
		
		// 추출
		System.out.println(iMap.containsKey(2));
		System.out.println(sMap.containsKey("meet"));
		System.out.println(voMap.containsKey(3));
		
		System.out.println(iMap.containsValue(20));
		System.out.println(sMap.containsValue("Nice"));
		
		System.out.println(iMap.get(2));
		System.out.println(sMap.get("meet"));
		System.out.println(voMap.get(3).age);
		
		Set<Integer> keys = iMap.keySet( );
		for( int key : keys) {
			System.out.println(iMap.get(key));
		}
		
		Collection <Integer> vals = iMap.values();
		for( int val : vals ) {
			System.out.println(val);
		}
		System.out.println();
		
		// 제거
		iMap.remove(2);
		sMap.remove("meet");
		voMap.remove(3);
		System.out.println(iMap.size());
		System.out.println(sMap.size());
		System.out.println(voMap.size());
		
		// 전체 제거
		iMap.clear();
		sMap.clear();
		voMap.clear();
		System.out.println(iMap.size());
		System.out.println(sMap.size());
		System.out.println(voMap.size());
	}
}

class Person_25 {
	String name;
	int age;
		
	public Person_25(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
