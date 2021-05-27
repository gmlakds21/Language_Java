package seunghee;

import java.io.FileInputStream;

public class _27_FileInputStream {
	public static void main(String[] args) {
		
		/* FileInputStream */
		FileInputStream fis = null;
		int i;
	
		try {
			/* 입력한 한글자씩 읽어오기 */ {
				fis = new FileInputStream("text_27.txt");
				System.out.print((char)fis.read( ));
				System.out.print((char)fis.read( ));
				System.out.print((char)fis.read( ));
				System.out.print((char)fis.read( ));
				System.out.println();
			}
			
			/* 입력한 여러글자 읽어오기 */ {
				fis = new FileInputStream("text_27.txt");
				while((i = fis.read()) != -1) {
					System.out.print((char)i);
				}
				System.out.println();
			}
			
			/* byte[]로 읽어오기 */ {
				fis = new FileInputStream("text_27.txt");
				byte[] bs = new byte[10];
				while((i = fis.read(bs)) != -1) {
					for (int k=0; k<i; k++) {
						System.out.print((char)bs[k]);
					}
					System.out.println(": "+i+"바이트 읽음");
				}
			} 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
