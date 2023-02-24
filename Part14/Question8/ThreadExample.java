package Part14.Question8;

/**
 * 3초 뒤 메인 스레드 종료시 MovieThread 도 같이 종료되게 하려고 할 때, 밑줄 친 부분에 적당한 코드 작성
 */
public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new MovieThread();
        thread.setDaemon(true);

        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }
}
