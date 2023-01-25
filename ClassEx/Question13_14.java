package ClassEx;

/**
 * 현실 세계의 회원을 Member 클래스로 모델링하려고 합니다.
 * 회원의 데이터로는 이름(문자열 name), 아이디(문자열 id), 패스워드(문자열 password), 나이(정수 age)
 * 이 데이터들을 가지는 Member 클래스 선언
 */
class Member {
    public String name;
    public String id;
    public String password;
    public Integer age;

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

/**
 * 13번 문제에서 작성한 Member 클래스에 생성자 추가
 * 다음과 같이 name 필드와 id 필드를 외부에서 받은 값으로 초기화하도록 생성자 선언
 * Member user1 = new Member("홍길동", "hong")
 */
public class Question13_14 {
    public static void main(String[] args) {
        Member member = new Member("홍길동","hong");
        System.out.println(member.name); //홍길동
        System.out.println(member.id);  //hong
    }
}
