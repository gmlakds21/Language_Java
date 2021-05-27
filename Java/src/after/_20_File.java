package after;

import java.io.File;
import java.io.IOException;

public class _20_File {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\SeungHee\\testFile.txt");
		file.createNewFile( );
		
		System.out.println(file.isFile());			// 파일 존재하는지
		System.out.println(file.isDirectory());		// 해당 파일이 폴더인지 아니면 false
		System.out.println(file.getName());			// 파일 이름
		System.out.println(file.getAbsolutePath());	// 파일 경로
		System.out.println(file.getPath());			// 파일 경로
		System.out.println(file.canRead());			// 읽기 가능 여부
		System.out.println(file.canWrite());		// 쓰기 가능 여부
		
		file.delete();
	}
}