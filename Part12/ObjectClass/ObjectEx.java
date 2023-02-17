package Part12.ObjectClass;

public class ObjectEx {
    public static void main(String[] args) {
        User user1 = new User("user_id","1");
        User user2 = new User("user_id","1");
        User user3 = new User("user_id","2");
        User user4 = new User("유저_아이디","1");

        //동등 객체입니다. {user_id, 1} == {user_id,1}
        if(user1.hashCode() == user2.hashCode()){
            if(user1.equals(user2)){
                System.out.println("동등 객체입니다.");
            } else {
                System.out.println("데이터가 다릅니다.");
            }
        } else {
            System.out.println("해쉬코드가 다릅니다.");
        }

        //해쉬코드가 다릅니다. {user_id, 1} == {user_id, 2}
        if(user1.hashCode() == user3.hashCode()){
            if(user1.equals(user3)){
                System.out.println("동등 객체입니다.");
            } else {
                System.out.println("데이터가 다릅니다.");
            }
        } else {
            System.out.println("해쉬코드가 다릅니다.");
        }

        //데이터가 다릅니다. {user_id, 1} == {유저_아이디, 1}
        if(user1.hashCode() == user4.hashCode()){
            if(user1.equals(user4)){
                System.out.println("동등 객체입니다.");
            } else {
                System.out.println("데이터가 다릅니다.");
            }
        } else {
            System.out.println("해쉬코드가 다릅니다.");
        }
    }
}
