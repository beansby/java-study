package Part12.DateTimeClass;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeZone {
    public static void main(String[] args) {
        //현재 날짜
        //Date 클래스 : 객체 생성, 현재 시간 기준
        Date today = new Date();
        System.out.println(today.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
        System.out.println(sdf.format(today));

        System.out.println("------------- 날짜 시간 정보 -------------");

        //Calendar 클래스 : 추상 클래스, get() 메소드 이용
        Calendar seoul = Calendar.getInstance();

        String year = seoul.get(Calendar.YEAR) + "년";
        String month = seoul.get(Calendar.MONTH)+1 + "월"; //0~11 -> +1 필요
        String day = seoul.get(Calendar.DAY_OF_MONTH) + "일";
        int amPm = seoul.get(Calendar.AM_PM);
        String strAmPm = null;
        if(amPm == Calendar.AM){
            strAmPm = "오전";
        } else {
            strAmPm = "오후";
        }
        String hour = seoul.get(Calendar.HOUR) +"시";
        String min = seoul.get(Calendar.MINUTE) +"분";

        System.out.println("서울 현재 시각 : "+ year +" "+ month +" "+ day +" "+ strAmPm +" "+ hour +" "+ min);

        TimeZone timeZone = TimeZone.getTimeZone("Europe/London");
        Calendar london = Calendar.getInstance(timeZone);

        String year2 = london.get(Calendar.YEAR) + "년";
        String month2 = london.get(Calendar.MONTH)+1 + "월"; //0~11 -> +1 필요
        String day2 = london.get(Calendar.DAY_OF_MONTH) + "일";
        int amPm2 = london.get(Calendar.AM_PM);
        String strAmPm2 = null;
        if(amPm2 == Calendar.AM){
            strAmPm2 = "오전";
        } else {
            strAmPm2 = "오후";
        }
        String hour2 = london.get(Calendar.HOUR) +"시";
        String min2 = london.get(Calendar.MINUTE) +"분";

        System.out.println("런던 현재 시각 : "+ year2 +" "+ month2 +" "+ day2 +" "+ strAmPm2 +" "+ hour2 +" "+ min2);


        //현재 날짜
        System.out.println("------------- 날짜 시간 조작 -------------");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a HH시 mm분");
        System.out.println("현재시간 : "+ now.format(dtf));

        //조작
        LocalDateTime after3yrs = now.plusYears(3);
        System.out.println("3년 후 : " + after3yrs.format(dtf));

        LocalDateTime before2mons = now.minusMonths(2);
        System.out.println("2달 전 : " + before2mons.format(dtf));

        //비교
        System.out.println("------------- 날짜 시간 비교 -------------");
        LocalDateTime target = LocalDateTime.of(2022,12,18,0,0);

        System.out.println("시작일 : " + now.format(dtf));
        System.out.println("종료일 : " + target.format(dtf));
        if(now.isBefore(target)){
            System.out.println("진행 중입니다.");
        } else if(now.isEqual(target)){
            System.out.println("종료일입니다.");
        } else if(now.isAfter(target)){
            System.out.println("종료됐습니다.");
        }
    }
}
