package Part9.OuterObject;

public class OuterClass {
    //OuterClass 인스턴스 필드
    String field = "바깥 클래스의 인스턴스 필드";

    //OuterClass 인스턴스 메소드
    void method(){
        System.out.println("바깥 클래스 인스턴스 메소드");
    }

    //중첩 클래스 : 인스턴스 멤버 클래스
    class InnerClass {
        //InnerClass 인스턴스 필드
        String field = "중첩 클래스 인스턴스 필드";
        //InnerClass 인스턴스 메소드
        void method(){
            System.out.println("중첩 클래스 인스턴스 메소드");
        }

        //InnerClass 인스턴스 메소드
        void this_method(){
            //중첩 클래스 객체의 필드, 메소드 사용
            System.out.println(this.field);
            this.method();

            //바깥 클래스 객체의 필드, 메소드 사용
            System.out.println(OuterClass.this.field);
            OuterClass.this.method();
        }
    }

    //OuterClass 인스턴스 메소드
    void useInnerClass() {
        InnerClass innerClass = new InnerClass();
        innerClass.this_method();
    }
}
