package Part12.ObjectClass;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        //HashSet 컬렉션 생성
        HashSet hashSet = new HashSet();

        User user1 = new User("user_id", "1");
        hashSet.add(user1);
        System.out.println("저장된 객체 수: " + hashSet.size());  //1

        User user2 = new User("user_id", "1");
        hashSet.add(user2);
        System.out.println("저장된 객체 수: " + hashSet.size());  //1

        User user3 = new User("user_id", "2");
        hashSet.add(user3);
        System.out.println("저장된 객체 수: " + hashSet.size());  //2

        User user4 = new User("유저_아이디", "1");
        hashSet.add(user4);
        System.out.println("저장된 객체 수: " + hashSet.size());  //3
    }
}
