package ClassEx;

/**
 *기메소드는 매개값을 콘후솔에 출력
 * println() 메소드의 매개값으로 int, boolean, double, String 타입 값 가능
 * 다음 조건과 예제 코드를 보고 Printer 클래스에서 println() 메소드를 오버로딩하여 선언
 * println() 메소드의 매개변수 value(int, boolean, double, String) / void
 */
class Printer {
    public void println(int value){
        System.out.println(value);
    }

    public void println(boolean value){
        System.out.println(value);
    }

    public void println(double value){
        System.out.println(value);
    }

    public void println(String value){
        System.out.println(value);
    }

}

public class Question16 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");
    }
}
