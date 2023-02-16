package Part12.Question8;


/**
 * 전체 코드를 실행하는데 걸린 시간을 구하는 코드 작성 (단위 나노초)
 */
public class Time {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(start);

        int[] scores = new int[1000];
        for(int i=0; i<scores.length; i++){
            scores[i] = i;
        }

        int sum = 0;
        for (int score : scores){
            sum += score;
        }

        double avg = sum/scores.length;
        System.out.println(avg);    //499.0

        long end = System.nanoTime();
        System.out.println(end);
        System.out.println((end-start) + "나노초 소요");
    }
}
