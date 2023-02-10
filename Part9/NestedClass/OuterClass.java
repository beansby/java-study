package Part9.NestedClass;

public class OuterClass {
    /**
     * 인스턴스 멤버 클래스
     */
    class InstanceMemberClass {
        //필드
        int field_1 = 7;

        //생성자
        InstanceMemberClass(){
            System.out.println("인스턴스 멤버 클래스 생성자 실행");
        }

        //메소드
        void method_1(){
            System.out.println("인스턴스 멤버 클래스 method_1() 실행");
        }
    }

    //인스턴스 멤버 클래스 객체 생성 : OuterClass 내부
    // 1) 인스턴스 필드 값
    InstanceMemberClass instanceField = new InstanceMemberClass();

    // 2) 생성자
    public OuterClass() {
        InstanceMemberClass constructor = new InstanceMemberClass();
    }

    // 3) 인스턴스 메소드
    void method(){
        InstanceMemberClass instanceMethod = new InstanceMemberClass();
        System.out.println(instanceMethod.field_1);
        instanceMethod.method_1();
    }

    /**
     * 정적 멤버 클래스
     */
    static class StaticMemberClass {
        int field_2 = 4;
        StaticMemberClass(){
            System.out.println("정적 멤버 클래스 생성자 실행");
        }
        void method_2(){
            System.out.println("정적 멤버 클래스 method_2() 실행");
        }
    }

    //정적 멤버 클래스 객체 생성 : OuterClass 내부
    // 1) 인스턴스 필드 값
    StaticMemberClass field_instance = new StaticMemberClass();
    // 2) 정적 필드 값
    static StaticMemberClass field_static = new StaticMemberClass();
    // 3) 생성자
//    OuterClass(){
//        StaticMemberClass constructor = new StaticMemberClass();
//    }
    // 4) 인스턴스 메소드
    void method_instance(){
        StaticMemberClass instanceMethod = new StaticMemberClass();
    }
    // 5) 정적 메소드
    static void method_static(){
        StaticMemberClass staticMethod = new StaticMemberClass();
    }

}
