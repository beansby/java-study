package Part12.SystemClass;

import java.io.IOException;

public class Keyboard {
    public static void main(String[] args) throws IOException {
        //in field
        int keyCode = 0;
        int volume = 0;


        while(true){
            //Enter 키 입력 전
            if(keyCode != 13 && keyCode != 10){
                if(keyCode == 49){
                    volume++;
                } else if (keyCode == 50){
                    volume--;
                } else if (keyCode == 51){
                    break;
                }

                System.out.println("--------------------------------");
                System.out.println(" 1. 볼륨증가 | 2. 볼륨감소 | 3. 종료 ");
                System.out.println("--------------------------------");
                System.out.println("현재 음량 : " + volume);
                System.out.print("선택 : ");
            }
            keyCode = System.in.read();

            //exit() 메소드 : 프로세스 강제 종료
            if(volume >= 5){
                System.out.println("프로세스 강제 종료");
                System.exit(0);
            }
        }

        System.out.println("종료");
    }
}
