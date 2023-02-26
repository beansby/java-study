package Part13.GenericType.Interface;

public class GenericExample {
    public static void main(String[] args) {
        //인터페이스 구현 클래스
        Pianist pianist = new Pianist();
        //재정의 된 메소드 : Piano 객체 리턴
        Piano piano = pianist.play();
        //Piano 객체의 메소드
        piano.pressKey();

        Footballer footballer = new Footballer();
        Football football = footballer.play();
        football.kick();

        Gamer gamer = new Gamer();
        Game game = gamer.play();
        game.gameStart();
        game.gameOver();
    }
}
