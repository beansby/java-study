package Part14.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExample {
    public static void main(String[] args) {
        // 스레드풀 생성 : 최대 4개
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        // 100명의 회원정보를 가지는 2차원 배열 리스트 생성
        String[][] users = new String[100][2];
        for (int i=0; i<users.length; i++){
            users[i][0] = "회원번호 :";
            users[i][1] = "20230"+i;
        }

        for (int i=0; i<100; i++){
            final int idx = i;
            //작업처리 요청
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    //현재 스레드 참조
                    Thread thread = Thread.currentThread();

                    String str = users[idx][0];
                    String num = users[idx][1];
                    System.out.println("["+ str +" "+ num +"] 가입완료");
                }
            });
        }
        // 스레드풀 종료
//        executorService.shutdown();
        executorService.shutdownNow();
    }
}
