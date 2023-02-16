package Part12.Question6;

public class Member {
    private String id;
    private String name;

    //생성란
    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        String str = id + ": " + name;
        return str;
    }
}
