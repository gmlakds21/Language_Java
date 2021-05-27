package seunghee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class _33_ObjectInputStream_ObjectOutputStream {
	public static void main(String[] args) {
				
		try {
			FileOutputStream fos = new FileOutputStream("text_33.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
						
			// 객체 생성
			Person_33 p1 = new Person_33("Kim", 20);
			Person_33 p2 = new Person_33("Lee", 30);
			
			// 객체 주입
			oos.writeObject(p1);
			oos.writeObject(p2);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream("text_33.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);			
			
			// 객체 읽기
			Person_33 p3 = (Person_33) ois.readObject();
			Person_33 p4 = (Person_33) ois.readObject();
			
			// 객체 확인
			System.out.println(p3.name);
			System.out.println(p4.age);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

class Person_33 implements Serializable{
	String name;
	int age;
	
	public Person_33(String name, int age) {
		this.name = name;
		this.age = age;
	}
}