package 날짜와시간;

// Data() : 운영제게로 부터 날짜와 시간 정보를 가져와 원하는 포멧 형태로 출력, 객체를 생성해야 한다.

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date; // 필요 (lang 패키지 X)

public class DateAncCal {
    public static void main(String[] args) {
        Date now = new Date();
//        System.out.println(now);
//
//        //원하는 포멧으로 변경하기
//        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
//        System.out.println(sdf.format(now));

        //yyyy : 연도를 네자리로 표시
        // yy : 연도를 두자리로 표시
        // MM : 월 (대문자 유의), MM과 M 차이는 09월, 9월
        // HH : 24시간제
        // hh : 12시간제
        // mm : 분
        SimpleDateFormat f1, f2, f3, f4,f5,f6,f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd"); // 년월일
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yy년 MM월 dd일");
        f4 = new SimpleDateFormat("HH:mm:ss");
        f5 = new SimpleDateFormat("오늘은 M월 W번째 주, d번째 날");
        f6 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");
        f7 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" +
                "");

//        System.out.println(f1.format(now));
//        System.out.println(f2.format(now));
//        System.out.println(f3.format(now));
//        System.out.println(f4.format(now));
//        System.out.println(f5.format(now));
//        System.out.println(f6.format(now));
//        System.out.println(f7.format(now));

        // Calendar
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+ 1); // 배열의 인덱스와 같이 0으로 시작
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 주에서 몇 번째 날
        System.out.println(cal.get(Calendar.AM_PM));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));



        // Calender 클래스로 yyyy년 MM월 dd일 HH시 mm분 ss초 출력

        int isPm = cal.get(Calendar.AM_PM);
        int hour = cal.get(Calendar.HOUR);
        if(isPm == 1) hour += 12; // 0 = 오전, 1 = 오후
        System.out.println(cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH)+ 1) + "월 " + cal.get(Calendar.DAY_OF_MONTH) + "일 " + hour + "시 " + cal.get(Calendar.MINUTE) + "분 " + cal.get(Calendar.SECOND) + "초");
        System.out.printf("%d년 %02d월 %02d일 %02d시 %2d분 %02d초", cal.get(Calendar.YEAR), (cal.get(Calendar.MONTH)+ 1), cal.get(Calendar.DAY_OF_MONTH), hour, cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
        //8월->08월로 사용하기 위해 %02d 사용
    }
}
