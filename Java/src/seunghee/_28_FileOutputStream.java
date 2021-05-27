package seunghee;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class _28_FileOutputStream {
	public static void main(String[] args) {
		
		/* FileOutputStream */
		FileOutputStream fos = null;
		int o;
		FileInputStream fis = null;
		int i;
		
		try {
			/* 한글자씩 입력하기 */ {
				fos = new FileOutputStream("text_28.txt");
				fos.write(65);
				fos.write(66);
				fos.write(67);

				/* 출력부분 */
				fis = new FileInputStream("text_28.txt");
				while((i = fis.read()) != -1) {
					System.out.print((char)i);
				}
				System.out.println();
			}
			
			/* byte[] 로 입력하기 */ {
				fos = new FileOutputStream("text_28.txt");
				byte[] bs = new byte[26];
				for(int k=0; k<26; k++) {
					bs[k] = (byte)(k+65);
				}
				fos.write(bs);
				
				/* 출력부분 */
				fis = new FileInputStream("text_28.txt");
				while((i = fis.read()) != -1) {
					System.out.print((char)i);
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
