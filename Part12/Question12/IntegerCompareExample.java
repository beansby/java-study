package Part12.Question12;

/**
 * 숫자 100과 300으로 각각 박싱된 Integer 객체를 == 연산자로 비교한 결과 100을 박식한 Integer 객체는 true, 300을 박싱한 Integer 객체는 false
 * 그 이유 설명, 값만 비교할 수 있도록 코드 수정
 */
public class IntegerCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        //== 연산자 : 객체의 번지 비교
        System.out.println(obj1 == obj2); //true : 공유되는 객체(-128~127)
        System.out.println(obj3 == obj4); //false
        //내부값 비교
        System.out.println(obj1.equals(obj2));  //true
        System.out.println(obj3.equals(obj4));  //true
    }
}

