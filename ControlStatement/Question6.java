package ControlStatement;

/**
 * for문을 이용해서 다음과 같은 실행 결과가 나오는 코드 작성
 * *
 * **
 * ***
 * ****
 * *****
 */
public class Question6 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                // 줄 바꿈 없이 i만큼 반복
                System.out.print("*");
            }
            // 줄 바꿈 처리
            System.out.println();
        }
    }
}
