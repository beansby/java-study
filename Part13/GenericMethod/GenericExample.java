package Part13.GenericMethod;

public class GenericExample {
    //제네릭 메소드  : 리턴타입 Content<T> 객체
    public static <T> Content<T> save(T t){
        Content<T> content = new Content<T>();
        content.setT(t);
        return content;
    }

    public static void main(String[] args) {
        Content<String> content1 = save("글을 작성합니다.");
        String strContent = content1.getT();
        System.out.println(strContent);

        Content<Integer> content2 = save(100);
        Integer intContent = content2.getT();
        System.out.println(intContent);
    }
}
