package Part11.Question7;

public class WrongPasswordException extends Exception {
    /**
     * WrongPasswordException 기본 생성자
     */
    public WrongPasswordException() {
    }

    /**
     * WrongPasswordException 예외 처리 메세지 입력 생성자
     * @param message
     */
    public WrongPasswordException(String message) {
//        System.out.println(message);
        super(message);
    }
}
