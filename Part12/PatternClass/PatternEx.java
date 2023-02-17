package Part12.PatternClass;

import java.util.regex.Pattern;

public class PatternEx {
    public static void main(String[] args) {
        //전화번호 정규 표현식
        String regEx = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-123-4567";
        String data2 = "010-1234-56789";

        boolean result = Pattern.matches(regEx, data);
        if(result){
            System.out.println("정규식과 일치합니다.");
        } else {
            System.out.println("정규식과 불일치합니다.");
        }

        boolean result2 = Pattern.matches(regEx, data2);
        if(result2){
            System.out.println("정규식과 일치합니다.");
        } else {
            System.out.println("정규식과 불일치합니다.");
        }
    }
}
