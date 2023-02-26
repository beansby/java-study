package Part13.GenericType.Interface;

public class Gamer implements Playable<Game> {
    @Override
    public Game play() {
        return new Game();
    }
}
