package Part13.TypeParameter.WildCard;

public class User {
}

class Admin extends User{}       //User 상속 관리자

class General extends User{}     //User 상속 일반 사용자

class PaidUser extends General{} //일반 사용자 상속 유료 사용자

class FreeUser extends General{} //일반 사용자 상속 무료 사용자
