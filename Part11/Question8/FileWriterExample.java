package Part11.Question8;

import java.io.IOException;

/**
 * FileWriter 는 파일을 열고 데이터 저장하는 클래스
 * 예외 발생 여부와 상관없이 마지막에는 close() 메소드를 실행해 파일을 닫음
 * try-catch-finally 를 이용해 작성한 코드를 리소스 자동 닫기를 이용하도록 수정
 */
public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt")) {
            fw.write("Java");
        } catch (Exception e) {
            e.printStackTrace();
        }
        /* 실행결과 :
        file.txt 파일을 엽니다.
        Java를 파일에 저장합니다.
        파일을 닫습니다.
        */
    }
}
