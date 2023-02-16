package Part12.Question11;

import java.util.StringTokenizer;

/**
 * 쉼표(,)로 구분되어 있는 문자열을 StringTokenizer 를 이용해 분리 및 출력
 * 아이디,이름,패스워드
 */
public class Tokenizer {
    public static void main(String[] args) {
        String str = "아이디,이름,패스워드";
        StringTokenizer st = new StringTokenizer(str, ",");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
