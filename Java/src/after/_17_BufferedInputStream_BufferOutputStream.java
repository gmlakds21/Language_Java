package after;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class _17_BufferedInputStream_BufferOutputStream {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		
		try {
			
			fis = new FileInputStream("input.txt");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("input3.txt");
			bos = new BufferedOutputStream(fos);
			
			int i;
			while(( i = bis.read( )) != -1) {
				bos.write(i);
				System.out.print((char)i);
			}
			bos.flush();
			bos.close();
		} catch(Exception e) {
			
		}
		// 기존에도 flush 랑 close 썼는지 보자
	}
}
