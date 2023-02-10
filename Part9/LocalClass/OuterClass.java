package Part9.LocalClass;

public class OuterClass {

    //로컬변수 param : OuterClass 메소드의 매개변수
    public void method_1(int param){
        //로컬변수 local : OuterClass 메소드 내부 선언
        int local = 4;
        System.out.println(local);
//        local = 7;
//        System.out.println(local);
        int local2 = 5;


        //로컬 클래스
        class LocalClass {
            int a = local;
            void method_2(){
                //로컬변수 읽기
                System.out.println("로컬변수 param 읽기: "+param);
                System.out.println("로컬변수 local 읽기: "+local);

                //로컬변수 수정 : final 특성을 가지기 때문에 변수값 수정 제한
                //param = 2;
                //local = 7;
            }
        }

        local2 = 10;

    }

    public static void main(String[] args) {
        OuterClass ex = new OuterClass();
        ex.method_1(4);
    }
}
