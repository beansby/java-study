package Part14.Question8;

public class MovieThread extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("동영상을 재생합니다.");

            try {
                Thread.sleep(1000);     //1초 일시정지
            } catch (InterruptedException e){}
        }
    }
}