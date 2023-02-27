package Part14.Daemon;

public class PlayThread extends Thread {
    public void play(){
        System.out.println("동영상을 재생함");
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            play();
        }
    }
}
