package seunghee;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class _32_DataInputStream_DataOutputStream {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("text_32.txt");
			DataInputStream dis = new DataInputStream(fis);
			FileOutputStream fos = new FileOutputStream("text_32.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
			System.out.println("Start");

			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14F);
			dos.writeUTF("TEST");
			dos.flush();
			dos.close();
			
			System.out.println("Time");
			
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
			
			System.out.println("End");
			
		} catch(Exception e) {
			
		}
		
	}
}
