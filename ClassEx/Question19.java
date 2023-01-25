package ClassEx;

/**
 * 은행 계좌 객체인 Account 객체는 잔고(balance) 필드를 가지고 있다.
 * balance 필드는 음수값이 될 수 없고, 최대 백만 원까지 저장 가능하다.
 * 외부에서 balance 필드를 변경하지 못하도록 하고, 0 <= balance <= 1,000,000 범위 값만 가질 수 있도록 Account 클래스 작성
 * Setter와 Getter 이용
 * 0은 MIN_BALANCE 로 1,000,000은 MAX_BALANCE 로 상수를 선언해서 이용
 * Setter의 매개값이 음수이거나 백만 원 초과시 현재 balance 값 유지
 */
class Account {
    Integer balance;
    final Integer MIN_BALANCE = 0;
    final Integer MAX_BALANCE = 1000000;

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        if (balance < MIN_BALANCE || balance > MAX_BALANCE) {
            System.out.println("잘못된 입력입니다.");
        } else {
            this.balance = balance;
        }
    }
}
public class Question19 {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(10000);;
        System.out.println("현재 잔고: " + account.getBalance());   //현재 잔고: 10000

        account.setBalance(-100);
        System.out.println("현재 잔고: " + account.getBalance());   //현재 잔고: 10000
    }
}
