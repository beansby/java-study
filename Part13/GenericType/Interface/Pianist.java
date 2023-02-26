package Part13.GenericType.Interface;

public class Pianist implements Playable<Piano> {
    @Override
    public Piano play() {
        return new Piano();
    }
}
