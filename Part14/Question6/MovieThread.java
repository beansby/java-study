package Part14.Question6;

public class MovieThread extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("동영상을 재생합니다.");
            //interrupt() 메소드 호출 = true 일 때 반복문 종료
            if(this.isInterrupted()){
                break;
            }
        }
    }
}
