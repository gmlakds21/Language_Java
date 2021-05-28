package seunghee.sungjuk._35_SungJukV7;

import java.util.Scanner;

public class SungJuk {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
	    SungJukService ser = new SungJukService();
	    ser.readSungJukDat();

	    String check = "1";
	    while ( !check.equals("0")) {
	    	ser.displayMenu();
	        check = sc.nextLine();

	        switch (check) {
	        	case "1" : ser.readSungJuk(); break;
	            case "2" : ser.showSungJuk(); break;
	            case "3" : ser.showAllSungJuk(); break;
	            case "4" : ser.modifySungJuk(); break;
	            case "5" : ser.removeSungJuk(); break;
	            case "0" : System.out.println("프로그램을 종료합니다.");
	                       ser.writeSungJukDat(); break;
	            default :  System.out.println("번호를 다시 확인해주세요.");
	        }
	    }
	}
}