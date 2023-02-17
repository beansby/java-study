package Part12.SystemClass;

public class MeasureRunTime {
    public static void main(String[] args) {
        //밀리초 단위 프로그램 처리 시간 측정
        long start = System.currentTimeMillis();
            int minus = 10000;
            for (int i=1; i<=100; i++){
                minus -= i;
            }
        long end = System.currentTimeMillis();

        System.out.println(minus);
        System.out.println("처리 시간 " + (end-start) + " 초 소요");

        //나노초 단위 프로그램 처리 시간 측정
        long startTime = System.nanoTime();

        int sum = 0;
        for(int i=1; i<=1000; i++){
            sum += i;
        }

        long endTime = System.nanoTime();

        System.out.println("1~1000까지 합 : " + sum);
        System.out.println("처리 시간 " + (endTime-startTime) + " 초 소요");
    }
}
