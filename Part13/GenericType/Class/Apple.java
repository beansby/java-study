package Part13.GenericType.Class;

/**
 * 제네릭 타입 클래스
 * @param <M>
 * @param <T>
 * @param <C>
 */
public class Apple<M, T, C> {
    //필드
    private M model;
    private T type;
    private C color;

    //메소드
    public M getModel() {
        return this.model;
    }

    public void setModel(M model) {
        this.model = model;
    }

    public T getType() {
        return this.type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public C getColor() {
        return this.color;
    }

    public void setColor(C color) {
        this.color = color;
    }
}
