package Part14.Question2;

/**
 * 동영상과 음악을 재생하기 위해 두가지 스레드를 실행.
 * 밑줄 친 부분에 적당한 코드 작성
 */
public class ThreadExample {
    public static void main(String[] args) {
        //스레드 객체 생성 : 동영상 재생
        Thread thread1 = new MovieThread();
        thread1.start();

        //스레드 객체 생성 : 음악 재생
        Thread thread2 = new Thread(new MusicRunnable());
        thread2.start();
    }
}
