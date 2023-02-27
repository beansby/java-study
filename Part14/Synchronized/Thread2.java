package Part14.Synchronized;

public class Thread2 extends Thread{
    //필드 : 공유 객체 타입
    private Calculator calculator;

    //생성자
    public Thread2(){
        setName("스레드_2");
    }

    //setter
    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    //Thread.run() 재정의
    @Override
    public void run() {
        //공유 객체의 동기화 블록이 있는 메소드 호출
        calculator.setMemory2(50);
    }
}
