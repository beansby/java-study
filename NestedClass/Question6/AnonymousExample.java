package NestedClass.Question6;

/**
 * AnonymousExample 클래스 실행 결과를 보고, Vehicle 인터페이스의 익명 구현 객체를
 * 필드, 로컬변수의 초기값, 메소드의 매개값으로 대입해보세요.
 */
public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();
        anony.field.run();  //자전거가 달립니다.
        anony.method1();   //승용차가 달립니다.
        anony.method2(new Vehicle() {   //트럭이 달립니다.
            @Override
            public void run() {
                System.out.println("트럭이 달립니다.");
            }
        });


    }
}

