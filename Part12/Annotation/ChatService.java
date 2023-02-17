package Part12.Annotation;

import java.util.Scanner;

public class ChatService {
    Scanner scanner = new Scanner(System.in);
    @ChatAnnotation(name="차은우")
    public void chat1(){
        String msg = scanner.nextLine();
    }

    @ChatAnnotation(name = "서강준", age=28)
    public void chat2(){
        String msg = scanner.nextLine();
    }
}
