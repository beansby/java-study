package Part12.ObjectClass;

public class User {
    public String id;
    public String code;

    //생성자
    public User(String id, String code) {
        this.id = id;
        this.code = code;
    }

    //Object 메소드 재정의
    @Override
    public int hashCode() {
        return code.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        //User 타입 검사
        if(obj instanceof User){
            User user = (User) obj;
            //id 문자열 비교
            if(id.equals(user.id)){
                return true;
            }
        }
        return false;
    }
}
