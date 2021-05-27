package seunghee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exam {
	public static void main(String[] args) {
		
		ArrayList<String> arr2 =  new ArrayList<>();
		arr2.add("abc");
		arr2.add("ABC");
		arr2.add("123");
		
		int i = 0;
		for (String data : arr2) {
			if(data.equals("ABC")) {
				System.out.println(i);
			}
			i++;
		}
		
		String[] words = {"AA", "BB", "CC"};

		System.out.println("리스트 변환");
		List<String> words2 = Arrays.asList(words);
		for(String arr : words2) {
			System.out.println(arr);
		}
		
		System.out.println("리스트 변환2");
		ArrayList<String> words3 = new ArrayList<String> (Arrays.asList(words));
		words3.add("D");
		words3.add("E");
		for(String arr : words3) {
			System.out.println(arr);
		}
		
		System.out.println("위치 찾기");
		System.out.println(words3.contains("D"));

		System.out.println("위치 기반");
		System.out.println(words3.indexOf("D"));
		
//		ArrayList<Person> voArr = new ArrayList<Person>();
//		voArr.add(new Person("김연아", 20));
//		voArr.add(new Person("유재석", 25));
//		voArr.add(new Person("하하", 30));
//
//		System.out.println(voArr.indexOf(new Person("유재석", 25)));
		
//		for(Person data : voArr) {
//			System.out.println((data.name).indexOf("유재석"));
//		}
		
		// System.out.println(voArr.indexOf(""));
		
	}
}

class Person {
	String name;
	int age;
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
}
