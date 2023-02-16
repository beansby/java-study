package Part12.Question10;

/**
 * 1부터 100까지의 숫자를 통 문자열로 만들기 위해 += 연산자 이용 100번 반복
 * 100개 이상의 String 객체를 생성하기 때문에 비효율적
 * StringBuilder 를 사용해 효율적인 코드로 개선
 */
public class StringBuilderExample {
    public static void main(String[] args) {
        String str = "";
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=100; i++){
            sb.append(i);
        }
        str = sb.toString();
        System.out.println(str);
    }
}
