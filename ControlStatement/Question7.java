package ControlStatement;

import java.util.Scanner;

/**
 * while문과 Scanner의 nextLine() 메소드를 이용해서 다음 실행 결과와 같이 키보드로부터
 * 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성
 */
public class Question7 {
    public static void main(String[] args) {
        // 실행
        boolean run = true;
        // 잔고
        int balance = 0;
        // 입력값
        Scanner scanner = new Scanner(System.in);

        while(run){
            System.out.println("------------------------------");
            System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("선택> ");

            int choice = scanner.nextInt();
            int money = 0;

            switch (choice){
                case 1 :
                    System.out.print("예금액>");
                    money = scanner.nextInt();
                    balance += money;
                    break;
                case 2 :
                    System.out.print("출금액>");
                    money = scanner.nextInt();
                    balance -= money;
                    break;
                case 3 :
                    System.out.print("잔고>");
                    System.out.println(balance);
                    break;
                case 4 :
                    run = false;
                    System.out.println("프로그램 종료");
                    break;
            }
        }
    }
}
