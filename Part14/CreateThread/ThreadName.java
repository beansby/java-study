package Part14.CreateThread;

public class ThreadName {
    public static void main(String[] args) {
        //현재 코드를 실행하는 스레드 객체 참조
        Thread main = Thread.currentThread();
        System.out.println(main.getName() + " 실행");

        for(int i=0; i<3; i++){
            Thread thread1 = new Thread(){
                @Override
                public void run() {
                    System.out.println(getName() + " 실행");
                }
            };
            thread1.start();
        }

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                System.out.println(getName() + " 실행");
            }
        };
        thread2.setName("변경할 스레드 이름");
        thread2.start();
    }
}
