package Part12.WrapperClass;

public class BoxingEx {
    public static void main(String[] args) {
        //박싱 : 기본타입(int) -> 포장객체(Integer)
        Integer boxing = 100;
        System.out.println("값 : " + boxing.intValue()); //100

        //언박싱 : 포장객체(Integer) -> 기본타입(int)
        int unboxing = boxing;
        System.out.println("값 : " + unboxing);  //100

        int result = boxing + 100;
        System.out.println("결과 : " +  result);  //200

        // == & != 연산자 : 객체 번지 비교
        // equals() : 내부값 비교
        Boolean boolean_1 = true;
        Boolean boolean_2 = true;
        System.out.println("== : " + (boolean_1 == boolean_2)); //true
        System.out.println("equals() : " + (boolean_1.equals(boolean_2)));  //true

        Integer int_1 = 100;
        Integer int_2 = 100;
        System.out.println("== : " + (int_1 == int_2)); //true
        System.out.println("equals() : " + (int_1.equals(int_2)));  //true

        Integer int_3 = 128;
        Integer int_4 = 128;
        System.out.println("== : " + (int_3 == int_4)); //false
        System.out.println("equals() : " + (int_3.equals(int_4)));  //true
    }
}
