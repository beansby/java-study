package Part14.Daemon;

public class MainThread {
    public static void main(String[] args) {
        PlayThread playThread = new PlayThread();
        //PlayThread를 데몬 스레드로 설정
        playThread.setDaemon(true);
        playThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }

        System.out.println("메인 스레드 종료");
    }
}
