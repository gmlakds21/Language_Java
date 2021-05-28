package seunghee.sungjuk;

public class _07_SungJukV1 {
	public static void main(String[] args) {
		
		String name = "유재석";
		int kor = 99;
		int eng = 98;
		int mat = 99;
		int sum = 0;
		double mean = 0.0;
		char grd = ' ';
		
		sum = (kor + eng + mat);
		mean = sum/3.0;
		
		grd = (mean>=90) ? '수' :
				(mean >= 80) ? '우' :
					(mean >= 70) ? '미' :
						(mean >= 60) ? '양' : '가';
		
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+mat);
		System.out.println("-------------");
		System.out.println("총점 : "+sum);
		System.out.printf("평균 : %.1f", mean);
		System.out.println("학점 : "+grd);
	}
}
