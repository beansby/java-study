package Part9.AnonymousObject;

public class HomeEx {
    public static void main(String[] args) {
        //Home 객체 생성
        Home home = new Home();

        home.fieldMethod();
        home.localVariable();
        home.methodParameter(new Key() {
            @Override
            public void open() {
                System.out.println("차고 문을 엽니다");
            }

            @Override
            public void lock() {
                System.out.println("차고 문을 잠급니다");
            }
        });
    }
}
