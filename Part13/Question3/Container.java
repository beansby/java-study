package Part13.Question3;

public class Container<A, B> {
    public A key;
    public B value;

    public A getKey() {
        return key;
    }

    public B getValue() {
        return value;
    }

    public void set(A key, B value) {
        this.key = key;
        this.value = value;
    }
}
