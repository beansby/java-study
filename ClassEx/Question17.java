package ClassEx;

/**
 * 16번 문제에서 Printer 객체 생성 후 println() 메소드 호출
 * Printer 객체를 생성하지 않고도 호출할 수 있도록 Printer 클래스 수정하기
 */
 class Printer2 {
    public static void println(int value){
        System.out.println(value);
    }

    public static void println(boolean value){
        System.out.println(value);
    }

    public static void println(double value){
        System.out.println(value);
    }

    public static void println(String value){
        System.out.println(value);
    }
}
public class Question17 {
    public static void main(String[] args) {
        Printer2.println(10);
        Printer2.println(true);
        Printer2.println(5.7);
        Printer2.println("홍길동");
    }
}
