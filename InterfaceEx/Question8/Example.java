package InterfaceEx.Question8;

/**
 * action() 메소드 호출시 매개값이 C 객체일 경우에만 method2() 호출되도록 코드 작성
 */
public class Example {
    public static void action(A a){
        a.method1();
        //연산자 미지원 버전 java
//        if(a instanceof C c){
//            C c = (C) a;
//            c.method2();
//        }
    }

    public static void main(String[] args) {
        action(new B());
        action(new C());
        /*
        B - method1()
        C - method1()
        C - method2()
         */
    }
}
