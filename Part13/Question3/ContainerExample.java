package Part13.Question3;


/**
 * ContainerExample 클래스의 main() 메소드는 Container 제네릭 타입 사용
 * main() 메소드에서 사용하는 방법 참고 Container 제네릭 타입 선언
 */
public class ContainerExample {
    public static void main(String[] args) {
        Container<String, String> container1 = new Container<String, String>();
        container1.set("홍길동", "도적");
        String name1 = container1.getKey();
        String job = container1.getValue();

        Container<String, Integer> container2 = new Container<String, Integer>();
        container2.set("홍길동", 35);
        String name2 = container2.getKey();
        int age = container2.getValue();

        System.out.println("이름 : "+name1);
        System.out.println("직업 : "+job);
        System.out.println("이름 : "+name2);
        System.out.println("나이 : "+age);
    }
}
