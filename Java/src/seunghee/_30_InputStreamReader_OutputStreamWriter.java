package seunghee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.concurrent.Delayed;

public class _30_InputStreamReader_OutputStreamWriter {
	public static void main(String[] args) {
		
		FileInputStream fis = null; 
		InputStreamReader isr = null;
		int i;
		
		try {
			fis = new FileInputStream("text_30.txt");
			isr = new InputStreamReader(fis);
			while((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("\nEnd");

		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		try {
			fos = new FileOutputStream("text_30.txt");
			osw = new OutputStreamWriter(fos);
			osw.write("asd");
			osw.flush();
			osw.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
