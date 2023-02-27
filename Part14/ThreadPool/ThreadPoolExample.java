package Part14.ThreadPool;

import java.util.concurrent.*;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // 1) 스레드풀 생성(Executors 메소드) : 초기수 0, 코어수 0, 60초 미작업시 스레드 제거
        ExecutorService executorService1 = Executors.newCachedThreadPool();

        // 2) 스레드풀 생성(Executors 메소드) : 초기수 0, 코어수 ?, 최대수 5, 스레드 제거 안 함
        ExecutorService executorService2 = Executors.newFixedThreadPool(5);

        // 3) 스레드풀 생성(ThreadPoolExecutor) : 코어수 3, 최대수 4, 120초 미작업시 스레드 제거, 작업큐?
        ExecutorService executorService3 = new ThreadPoolExecutor(3, 4, 120L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());

        // 1) 스레드 종료(ExecutorService 메소드)
        executorService1.shutdown();

        // 2) 스레드 종료(ExecutorService 메소드)
        executorService2.shutdownNow();
    }
}
