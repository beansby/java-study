package Part12.Question17;

import java.util.regex.Pattern;

/**
 * 정규표현식을 이용해 첫번째는 알파벳으로 시작, 두번째부터 숫자+알파벳으로 구성된 8~12자 사이의 ID값인지 검사
 * 알파벳은 대소문자 모두 허용하는 코드 작성
 */
public class PatternMatcherExample {
    public static void main(String[] args) {
        String id = "5Angel1004";   //ID로 사용할 수 없습니다.
        String id2 = "Angel1004";   //ID로 사용할 수 있습니다.

        //정규표현식
        String regExp = "[a-zA-Z][a-zA-Z_0-9]{7,11}";

        //검증
        boolean isMatch = Pattern.matches(regExp, id2);

        if(isMatch){
            System.out.println("ID로 사용할 수 있습니다.");
        } else {
            System.out.println("ID로 사용할 수 없습니다.");
        }
    }
}
