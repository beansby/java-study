package ClassEx;

import java.util.Objects;
import java.util.Scanner;

/**
 * 키보드로부터 계좌 정보를 입력받아 계좌를 관리하는 프로그램이다.
 * 계좌는 Account 객체로 생성, BankApplication 에서 길이 100인 Account[] 배열로 관리된다.
 * 실행 결과를 보고, Account 와 BankApplication 클래스 작성
 * (키보드로 입력받을 시 Scanner의 nextLine() 메소드 사용
 */
class Account2 {
    String account;
    String name;
    Integer deposit;

    public Account2(String account, String name, Integer deposit) {
        this.account = account;
        this.name = name;
        this.deposit = deposit;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }
}
public class Question20 {
    private static Account2[] accArray = new Account2[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run){
            System.out.println("--------------------------------------------");
            System.out.println(" 1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("--------------------------------------------");
            System.out.print("선택> ");

            int choice = scanner.nextInt();

            /* if문 시작 */
            if (choice == 1){
                System.out.println("----------");
                System.out.println("계좌생성");
                System.out.println("----------");
                System.out.print("계좌번호: ");
                String account = scanner.next();
                System.out.print("계좌주: ");
                String name = scanner.next();
                System.out.print("초기입금액: ");
                Integer deposit = scanner.nextInt();
                //계좌생성
                Account2 newAcc = new Account2(account, name, deposit);
                //계좌배열에 저장
                for(int i=0; i<accArray.length; i++){
                    if(accArray[i] == null){
                        accArray[i] = newAcc;
                        System.out.println("결과 : 계좌가 생성되었습니다");
                        break;
                    }
                }
            } else if(choice == 2){
                System.out.println("----------");
                System.out.println("계좌목록");
                System.out.println("----------");

                //계좌목록 조회
                for(int i=0; i<accArray.length; i++){
                    Account2 acc = accArray[i];
                    if(acc != null) {
                        System.out.println(acc.getAccount() + " " + acc.getName() + " " + acc.getDeposit());
                    }
                }
            } else if(choice == 3){
                System.out.println("----------");
                System.out.println("예금");
                System.out.println("----------");
                System.out.print("계좌번호: ");
                String account = scanner.next();
                System.out.print("예금액: ");
                int money = scanner.nextInt();

                // 입금계좌 조회
                Account2 acc = findAccount(account);
                if(acc == null){
                    return;
                } else {
                    acc.setDeposit(acc.getDeposit() + money);
                    System.out.println("결과: 예금이 성공되었습니다.");
                }

            } else if(choice == 4){
                System.out.println("----------");
                System.out.println("출금");
                System.out.println("----------");
                System.out.print("계좌번호: ");
                String account = scanner.next();
                System.out.print("출금액: ");
                int money = scanner.nextInt();

                //출금계좌 조회
                Account2 acc = findAccount(account);
                if(acc == null){
                    return;
                } else {
                    if(acc.getDeposit() >= money){
                        acc.setDeposit(acc.getDeposit() - money);
                        System.out.println("결과: 출금이 성공되었습니다.");
                    } else {
                        System.out.println("결과: 잔액이 부족합니다.");
                    }
                }

            } else if(choice == 5){
                run = false;
                System.out.println("프로그램 종료");
            }
            /* if문 종료 */

        }
    }

    //계좌조회
    private static Account2 findAccount(String account){
        Account2 acc = null;
        for (int i=0; i<accArray.length; i++){
            if(accArray[i] != null){
                //배열 인덱스의 계좌번호 참조변수에 저장
                String findAcc = accArray[i].getAccount();
                //참조변수 == 매개변수 : 해당 인덱스 값을 Account 객체에 저장
                if(findAcc.equals(account)){
                    acc = accArray[i];
                    break;
                }
            }
        }
        return acc;
    }
}
