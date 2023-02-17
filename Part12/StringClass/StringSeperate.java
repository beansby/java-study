package Part12.StringClass;

import java.util.StringTokenizer;

public class StringSeperate {
    public static void main(String[] args) {
        //단일 구분자 : StringTokenizer 클래스
        String data = "문자1/문자2/문자3/문자4";
        // 1) StringTokenizer 객체 생성
        StringTokenizer st = new StringTokenizer(data, "/");
        // 2) 남은 문자열 조사 후 분리된 문자열 가져오기
        while (st.hasMoreTokens()){
            String token = st.nextToken();
            System.out.println(token);
        }

        System.out.println();

        //복수 구분자 : split() 메소드
        String data2 = "문자1&문자2-문자3,문자4";
        String[] str = data2.split("&|-|,");
        for(String token : str){
            System.out.println(token);
        }
    }
}
