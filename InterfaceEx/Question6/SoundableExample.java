package InterfaceEx.Question6;

/**
 * Soundable 인터페이스는 추상 메소드 sound() 를 가지고 있다.
 * SoundableExample 클래스의 printSound() 메소드는 매개변수 타입으로 Soundable 인터페이스를 가진다.
 * printSound() 호출시 Cat과 Dog 객체를 주고 실행시 각각 "야옹", "멍멍"이 출력되게 클래스 작성
 */
public class SoundableExample {
    public static void printSound(Soundable soundable){
        System.out.println(soundable.sound());
    }
    public static void main(String[] args) {
        printSound(new Cat()); //야옹
        printSound(new Dog()); //멍멍
    }
}
