package ClassInheritance_Abstract.Question12;

/**
 * Example 클래스에서 action() 메소드 호출시 매개값이 C 객체일 경우에만 method2() 호출되도록 코드 작성
 */
public class Example {
    public static void action(A a){
        a.method1();
//        if (a instanceof C c) {
//            c.method2();
//        }
    }

    public static void main(String[] args) {
        action(new A());
        action(new B());
        action(new C());
    }
}
