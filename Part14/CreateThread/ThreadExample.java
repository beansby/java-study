package Part14.CreateThread;

public class ThreadExample {
    public static void main(String[] args) {
        // 1) 스레드 생성 : Runnable 구현 객체를 Thread 생성자 매개값으로 전달
        Runnable work = new Work();
        Thread thread = new Thread(work);

        // 2) 스레드 생성 : Runnable 익명 구현 객체를 Thread 생성자 매개값으로 전달
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        // 3) 스레드 생성 : Thread 자식 클래스 객체 생성
        Thread thread3 = new ChildThread();

        // 4) 스레드 생성 : Thread 익명자식객체
        Thread thread4 = new Thread(){
            @Override
            public void run() {

            }
        };
    }
}

/**
 * Runnable 구현 클래스 Work
 */
class Work implements Runnable{
    @Override
    public void run() {

    }
}

/**
 * Thread 자식 클래스 ChildThread
 */
class ChildThread extends Thread {
    @Override
    public void run() {

    }
}