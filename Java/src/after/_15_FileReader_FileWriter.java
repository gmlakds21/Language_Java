package after;

import java.io.FileReader;
import java.io.FileWriter;

public class _15_FileReader_FileWriter {
	public static void main(String[] args) {

		FileWriter fw = null;
		FileReader fr = null;
		int i;
		
		try {
			/* FileWriter */
			fw = new FileWriter("reader.txt");
			fw.write('A');
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			
			fw.write(buf);
			fw.write("안녕하세요");
			fw.write(buf, 1, 2);
			fw.write("65");
			fw.flush();
			fw.close();
		
			/* FileReader */
			fr = new FileReader("reader.txt");
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("End");
	}
}
// ABCDEFG안녕하세요CD65