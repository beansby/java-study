package Part13.GenericType.Interface;

public class Footballer implements Playable<Football> {
    @Override
    public Football play() {
        return new Football();
    }
}
