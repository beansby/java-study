package Part12.Question6;

/**
 * Member 클래스에서 Object 의 toString() 메소드 오버라이딩해서 MemberExample 실행 결과처럼 출력되게 작성
 * blue: 이파란
 */
public class MemberExample {
    public static void main(String[] args) {
        Member member = new Member("blue", "이파란");
        System.out.println(member);
    }
}
