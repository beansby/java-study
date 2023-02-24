package Part14.Question6;

import Part14.Question6.MovieThread;

/**
 * 메인 스레드에서 3초 후 MovieThread 의 interrupt() 메소드를 호출해 MovieThread 를 안전하게 종료하고 싶다.
 * 비어있는 부분에 적당한 코드 작성
 */

public class ThreadExample {
    public static void main(String[] args) {
        //MovieThread 생성
        Thread thread = new MovieThread();
        thread.start();

        try{ Thread.sleep(3000);    //3초 일시정지
        } catch (InterruptedException e) {
        }

        //스레드 일시정지 상태일 때 예외발생
        thread.interrupt();
    }
}
