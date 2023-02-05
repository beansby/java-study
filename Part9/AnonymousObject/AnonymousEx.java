package Part9.AnonymousObject;

public class AnonymousEx {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();

        anonymous.fieldMethod();                     //동물이 내는소리 /n 멍멍
        anonymous.localVariable();                  //야옹
        anonymous.methodParameter(new Animal(){     //어흥
            @Override
            public void sound() {
                System.out.println("어흥");
            }
        });
    }
}
