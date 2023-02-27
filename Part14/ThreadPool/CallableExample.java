package Part14.ThreadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) {
        // 스레드풀 생성 : 최대 4개
        ExecutorService executorService = Executors.newFixedThreadPool(4);


        for (int i=0; i<100; i++){
           final int idx = i;
           //작업처리 요청
            Future<Integer> future = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int sum = 0;
                    for(int i=1; i<=idx; i++){
                        sum += i;
                    }

                    //현재 스레드 참조
                    Thread thread = Thread.currentThread();
                    System.out.println("["+ thread.getName() +"] 1~"+ idx + "합계");

                    //리턴 : 작업 처리 결과
                    return sum;
                }
            });

            try {
                int result = future.get();
                System.out.println("\t리턴값: "+result);
            } catch (Exception e){
                e.printStackTrace();
            }
        }

        //스레드풀 종료
//        executorService.shutdown();
        executorService.shutdownNow();
    }
}
