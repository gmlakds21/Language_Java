package after;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class _19_ObjectInputStream_ObjectOutputStream {
	public static void main(String[] args) {
				
		try {
			FileOutputStream fos = new FileOutputStream("VO.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
						
			// 객체 생성
			Person p1 = new Person("Kim", 20);
			Person p2 = new Person("Lee", 30);
			
			// 객체 주입
			oos.writeObject(p1);
			oos.writeObject(p2);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream("VO.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);			
			
			// 객체 읽기
			Person p3 = (Person) ois.readObject();
			Person p4 = (Person) ois.readObject();
			
			// 객체 확인
			System.out.println(p3.name);
			System.out.println(p4.age);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}