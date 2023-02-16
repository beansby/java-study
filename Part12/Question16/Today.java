package Part12.Question16;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * SimpleDateFormat 클래스 이용, 오늘 날짜를 다음과 같이 출력하는 코드 작성
 * xxxx년 xx월 xx일 x요일 xx시 xx분
 */
public class Today {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 kk시 mm분");
        String today = sdf.format(new Date());
        System.out.println(today);
    }
}
