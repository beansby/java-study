package Part13.TypeParameter.Bounded;

public class GenericExample {
    public static void main(String[] args) {
        boolean result_double = compare(10.2,10.2);
        System.out.println(result_double);

        boolean result_mix = compare(10.8, 10);
        System.out.println(result_mix);

        boolean result_int = compare(10, 10);
        System.out.println(result_int);
    }

    public static <T extends Number> boolean compare(T num1, T num2){
        //매개변수 num1, num2 타입
        System.out.println(num1.getClass().getSimpleName() +"와 "+num2.getClass().getSimpleName() +"비교");

        double v1 = num1.doubleValue();
        double v2 = num2.doubleValue();

        return (v1 == v2);
//        return (num1 == num2);
    }
}
