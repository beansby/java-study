package Part9.AnonymousObject;

public class Home {
    // 1) 필드 : 익명구현객체
    private Key room = new Key() {
        @Override
        public void open() {
            System.out.println("안방 문을 엽니다");
        }

        @Override
        public void lock() {
            System.out.println("안방 문을 잠급니다");
        }
    };

    public void fieldMethod(){
        room.open();
        room.lock();
    }

    // 2) 로컬변수값 : 익명구현객체
    public void localVariable(){
        Key toilet = new Key() {
            @Override
            public void open() {
                System.out.println("화장실 문을 엽니다");
            }

            @Override
            public void lock() {
                System.out.println("화장실 문을 잠급니다");
            }
        };
        toilet.open();
        toilet.lock();
    }

    // 3) 매개변수값 : 익명구현객체
    public void methodParameter(Key garage){
        garage.open();
        garage.lock();
    }
}
