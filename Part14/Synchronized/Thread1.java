package Part14.Synchronized;

public class Thread1 extends Thread{
    //필드 : 공유 객체 타입
    private Calculator calculator;

    //생성자
    public Thread1() {
        setName("스레드_1");
    }

    //setter
    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    //Thread.run() 재정의
    @Override
    public void run() {
        //공유 객체의 동기화 메소드 실행
        calculator.setMemory1(100);
    }
}
