package Part11.Question7;

public class NotExistIDException extends Exception{
    /**
     * NotExistIDException 기본 생성자
     */
    public NotExistIDException(){}

    /**
     * NotExistIDException 예외 처리 메세지 입력 생성자
     * @param message
     */
    public NotExistIDException(String message){
//        System.out.println(message);
        super(message);
    }
}
