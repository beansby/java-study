package Part12.Question9;

import java.io.UnsupportedEncodingException;

/**
 * 다음 바이트 배열은 UTF-8 문자셋으로 인코딩한 데이터, 다시 문자열로 디코딩해 변수 data 에 저장
 */
public class DecodingExample {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = {-20, -107, -120, -21, -123, -107};
        String str = new String(bytes, "UTF-8");
        System.out.println("str: "+str);    //str: 안녕
    }
}
