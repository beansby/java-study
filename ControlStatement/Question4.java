package ControlStatement;

/**
 * while문과 Math.random() 메소드를 이용해서 두개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력,
 * 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드 작성
 * 눈의 합이 5가 되는 경우는 (1,4), (4,1), (2,3), (3,2)
 */
public class Question4 {
    public static void main(String[] args) {
        while(true){
            // 0부터 시작하기 때문에 +1
            int num1 = (int)(Math.random()*6) + 1;
            int num2 = (int)(Math.random()*6) + 1;
            System.out.println("(" + num1 + ", " + num2 + ")");

            int sum = num1+num2;
            if (sum == 5){
                System.out.println("주사위 던지기 종료");
                break;
            }
        }
    }
}
