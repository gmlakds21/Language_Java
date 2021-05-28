package seunghee.sungjuk._35_SungJukV7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class SungJukService {

	// 멤버변수 선언
	ArrayList<SungJukVO> VOdata = new ArrayList<>();
	SungJukVO person = new SungJukVO();
	
	private String fpath = "sungjuk.txt";         // 데이터 베이스를 저장할 공간
	private FileReader fr;
	private FileWriter fw;
	private BufferedReader br;
	private BufferedWriter bw;

	// 프로그램 실행시
	void readSungJukDat() {		
		try {
			fr = new FileReader( fpath );
			br = new BufferedReader( fr );
			
			while ( br.ready() ) {
				String[] personData = br.readLine().split(", ");
				// String line = br.readLine();
				// String[] person = line.split(", "); 과 동일한 말
				person = new SungJukVO(personData[0], Integer.parseInt(personData[1]), Integer.parseInt(personData[2]), Integer.parseInt(personData[3]), Integer.parseInt(personData[4]),  Double.parseDouble(personData[5]), personData[6].charAt(0));
				VOdata.add(person);
			}
			
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 프로그램 종료시
	void writeSungJukDat() {
		String fmt = "%s, %s, %s, %s, %s, %.1f, %s";
		
	    try {
			fw = new FileWriter( fpath );
			bw = new BufferedWriter( fw );

			Iterator<SungJukVO> person = VOdata.iterator();
			while ( person.hasNext() ) {
				String data = String.format(fmt, person.next().getName(), person.next().getKor(), person.next().getEng(), person.next().getMat(), person.next().getSum(), person.next().getMean(), person.next().getGrd());
				bw.write(data);
				bw.newLine();  // 입력후 줄바꾸기 println 또는 \n과 같은 의미
			}
			
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void displayMenu() {
		StringBuilder sb = new StringBuilder();
	    sb.append("----------------------\n")
	    	.append(" 1. 학생 성적 입력\n")
	        .append(" 2. 학생 성적 조회\n")
	        .append(" 3. 학생 성적 상제 조회\n")
	        .append(" 4. 학생 성적 수정\n")
	        .append(" 5. 학생 정보 삭제\n")
	        .append(" 0. 프로그램 종료\n")
	        .append("----------------------\n")
	        .append("원하시는 작업은 ? ");
	    System.out.print(sb);
	}

	public void readSungJuk () {
		Scanner scanner = new Scanner(System.in);
	    String name;
	    int kor;
	    int eng;
	    int mat;

	    System.out.print("이름을 입력해 주세요 : ");
	    name = scanner.nextLine();
	    System.out.print("국어 점수를 입력해 주세요 : ");
	    kor = scanner.nextInt();
	    System.out.print("영어 점수를 입력해 주세요 : ");
	    eng = scanner.nextInt();
	    System.out.print("수학 점수를 입력해 주세요 : ");
	    mat = scanner.nextInt();
	    System.out.println();

	    person = new SungJukVO(name, kor, eng, mat);
	    computeSungJuk(person);
	    VOdata.add(person);
	}

	public void computeSungJuk (SungJukVO sj){
		sj.setSum(sj.getKor() + sj.getEng() + sj.getMat());
	    sj.setMean(sj.getSum() / 3.0);
	    switch ((int) sj.getMean() / 10) {
	         case 10:
	         case 9: sj.setGrd('수'); break;
	         case 8: sj.setGrd('우'); break;
	         case 7: sj.setGrd('미'); break;
	         case 6: sj.setGrd('양'); break;
	         default: sj.setGrd('가'); break;
	    }
	}

	public void showSungJuk () {
		String fmt = "이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d\n";
	    Iterator<SungJukVO> iter = VOdata.iterator();
	     
	    while (iter.hasNext()) {
	    	person = iter.next();
	    	System.out.printf(fmt, person.getName(), person.getKor(), person.getEng(), person.getMat());
	    }
	}

	public void showAllSungJuk () {

		Scanner sc = new Scanner(System.in);
		String fmt = "이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 : %.1f, 학점 : %c\n";
		
		System.out.print("상세 조회할 학생이름을 입력해 주세요 : ");
		String target = sc.nextLine();
		
		// 이터레이터를 이용 한 방법
		Iterator<SungJukVO> iter = VOdata.iterator();
		while (iter.hasNext()) {
			person = iter.next();
			if(person.getName().equals(target)) {
				System.out.printf(fmt, person.getName(), person.getKor(), person.getEng(), person.getMat(), person.getSum(), person.getMean(), person.getGrd());
			}
	    }	
		
		// 포이치문을 이용한 방법
		for(SungJukVO person : VOdata) {
			if (person.getName().equals(target)) {
				System.out.printf(fmt, person.getName(), person.getKor(), person.getEng(), person.getMat(), person.getSum(), person.getMean(), person.getGrd());
			}
	    }
	}

	public void modifySungJuk() { }
	public void removeSungJuk() { }
	
}