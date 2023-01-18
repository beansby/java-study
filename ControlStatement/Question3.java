package ControlStatement;

/**
 * for문을 이용해서 1부터 100까지의 정수 중 3의 배수 총합을 출력하는 코드 작성
 */
public class Question3 {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        for (i=1; i<=100; i++){
            if ((i%3) != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum); //1683
    }
}
