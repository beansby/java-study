package Part13.Question4;

/**
 * Util 클래스의 정적 메소드 getValue() 는 첫번째 매개값으로 Pair 타입과 하위 타입, 두번째 매개값으로 키값.
 * 리턴값은 키값 일치 시 Pair 에 저장된 값 리턴,
 * 일치하지 않으면 null 리턴하는 Util 클래스와 제네릭 메소드 getValue() 작성
 */
public class UtilExample {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("홍길동", 35);
        Integer age = Util.getValue(pair, "홍길동");
        System.out.println(age);

        ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
        Integer childAge = Util.getValue(childPair, "홍삼순");
        System.out.println(childAge);

        //컴파일 에러
//        OtherPair<String, Integer> otherPair = new OtherPair<>("홍삼원", 20);
//        Integer otherAge = Util.getValue(otherPair, "홍삼원");
//        System.out.println(otherAge);
    }
}
