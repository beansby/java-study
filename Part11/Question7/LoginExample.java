package Part11.Question7;

/**
 * login() 메소드에서 존재하지 않는 ID 입력시 NotExistIDException 발생,
 * 잘못된 패스워드 입력시 WrongPasswordException 발생
 * LoginExample 의 실행결과를 보고 빈칸 완성
 * 아이디가 존재하지 않습니다. / 패스워드가 틀립니다.
 */
public class LoginExample {
    public static void main(String[] args) {
        try {
            login("white","12345");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            login("blue","54321");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void login(String id, String password) throws Exception {
        //id != blue 일 때 NotExistIDException 발생
        if(!id.equals("blue")){
            throw new NotExistIDException("아이디가 존재하지 않습니다.");
        }

        //password != 12345 일 때 WrongPasswordException 발생
        if(!password.equals("12345")){
            throw new WrongPasswordException("패스워드가 틀립니다.");
        }

    }
}
