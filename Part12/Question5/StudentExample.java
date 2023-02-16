package Part12.Question5;

import java.util.HashSet;

/**
 * Object 의 equals() 와 hashCode() 메소드 오버라이딩해서 Student 의 학번(studentNum)이 같으면 동등객체가 될 수 있게 Student 클래스 작성
 * hashCode() 메소드 리턴값은 studentNum 필드값
 */
public class StudentExample {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<Student>();

        hashSet.add(new Student("1"));
        hashSet.add(new Student("1"));
        hashSet.add(new Student("2"));

        System.out.println("저장된 Student 수: " + hashSet.size()); //2
    }
}
