package Part9.AnonymousObject;


public class Anonymous {
    // 필드 : Animal 객체
    Animal animal = new Animal();

    // 1) 필드 : 익명자식객체
    Animal dog = new Animal(){
        @Override
        public void sound() {
            System.out.println("멍멍");
        }
    };

    public void fieldMethod(){
        animal.sound();
        dog.sound();
    }

    // 2) 로컬변수 값 : 익명자식객체
    public void localVariable(){
        Animal cat = new Animal(){
            @Override
            public void sound() {
                System.out.println("야옹");
            }
        };
        cat.sound();
    }

    // 3) 매개변수 값 : 익명자식객체
    public void methodParameter(Animal tiger){
        tiger.sound();
    }

}
