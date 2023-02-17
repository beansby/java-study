package Part12.SystemClass;

public class PrintConsole {
    public static void main(String[] args) {
        //out field
        System.out.println("콘솔에 원하는 문자열 출력");

        //err field
        try {
            int number = Integer.parseInt("1oo");
        } catch (NumberFormatException e) {
            System.err.println("[에러 내용]");
            System.err.println(e.getMessage());
        }
    }
}
