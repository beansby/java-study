package Part12.StringClass;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteToString {
    public static void main(String[] args) throws Exception {
        String data = "문자열";
        System.out.println("데이터 : " + data);

        //인코딩 (기본 문자셋 UTF-8) : byte[] -> String
        byte[] byteArr = data.getBytes();
        System.out.println("byte배열(UTF-8) : " + Arrays.toString(byteArr));

        //인코딩 (특정 문자셋 EUC-KR) : byte[] -> String
        byte[] byteArr2 = data.getBytes("EUC-KR");
        System.out.println("byte배열(EUC-KR) : " + Arrays.toString(byteArr2));

        //디코딩 (기본 문자셋 UTF-8) : String -> byte[]
        String str = new String(byteArr);
        System.out.println("문자열(UTF-8) : " + str);

        //디코딩 (특정 문자셋 EUC-KR) : String -> byte[]
        String str2 = new String(byteArr2, "EUC-KR");
        System.out.println("문자열(EUC-KR) : " + str2);
    }
}
