package seunghee.sungjuk._11_SungJukV5;

public class SungJuk {
    public static void main(String[] args) {

        SungJukService ser = new SungJukService(); // 기능만 담고 있는
        SungJukDAO dao = new SungJukDAO();


        // 성적 입력받기
        SungJukVO person = ser.setSungJuk();
        // 성적 계산하기
        ser.computeSungJuk(person);
        // 성적 출력하기
        dao.printSungJuk(person);

        SungJukVO[] p = new SungJukVO[2];
        for (int i = 0; i < p.length; i++ )
        {
            p[i] = ser.setSungJuk();
            ser.computeSungJuk(p[i]);
        }
        for (int i = 0; i < p.length; i++ )
        { dao.printSungJuk(p[i]);}

    }
}