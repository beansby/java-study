package ClassEx;

import java.util.Objects;

/**
 * login() 메소드 호출할 때 매개값으로 id와 password 제공
 * logout() 메소드 호출시 id만 매개값으로 제공
 * 다음 조건과 예제 코드를 보고 MemberService 클래스에서 login(), logout() 메소드 선언
 * login() 메소드는 매개값 id가 "hong", password가 "12345"일 경우에만 true 리턴 / boolean
 * logout() 메소드는 id+"님이 로그아웃 되었습니다"가 출력되도록 할 것 / void
 */
class MemberService {
    public boolean login(String id, String password) {
        if (Objects.equals(id, "hong") && Objects.equals(password, "12345")){
            return true;
        }
        return false;
    }
    public void logout(String id){
        System.out.println(id+"님이 로그아웃 되었습니다");
    }
}

public class Question15 {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        boolean result = memberService.login("hong", "12345");
        if (result) {
            System.out.println("로그인 되었습니다");
            memberService.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다");
        }
    }
}

