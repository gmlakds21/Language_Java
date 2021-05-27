package seunghee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _23_ArrayList {
	public static void main(String[] args) {
		
		/* 선언 */ {
			ArrayList<Integer> iList = new ArrayList<Integer>();
			ArrayList<String> sList = new ArrayList<String>();
			ArrayList<Person> voList = new ArrayList<Person>();
			
		}
		/* ArrayList1 */ {
			System.out.println("arr1");
			
			ArrayList<Integer> arr1 = new ArrayList<Integer>();
			arr1.add(3);
			arr1.add(4);
			arr1.add(5);
			
			for(int arr : arr1) {
				System.out.println(arr);
			}
			
			System.out.println("\narr2");
			
			ArrayList<String> arr2 =  new ArrayList<>();
			arr2.add("abc");
			arr2.add("ABC");
			arr2.add("123");
			
			for(String arr : arr2) {
				System.out.println(arr);
			}
		}
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