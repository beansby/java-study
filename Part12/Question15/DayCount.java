package Part12.Question15;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * 올해 12월 31일까지 몇일이 남았는지 구하는 코드 작성
 */
public class DayCount {
    public static void main(String[] args) {
        //현재
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //올해 12월 31일
        LocalDateTime dDay = LocalDateTime.of(LocalDateTime.now().getYear(), 12,31,0,0);
        System.out.println(dDay);

        //일 단위
        long count = now.until(dDay, ChronoUnit.DAYS);
        System.out.println("12월 31일까지 " + count + "일 남았습니다.");
    }
}
