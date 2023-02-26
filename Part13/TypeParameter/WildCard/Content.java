package Part13.TypeParameter.WildCard;

public class Content {
    public static void accessContent1(Available<?> user){
        System.out.println(user.user.getClass().getSimpleName()+"가 컨텐츠1 (을)를 이용할 수 있습니다.");
    }

    //일반 사용자 제한
    public static void accessContent2(Available<? extends General> user){
        System.out.println(user.user.getClass().getSimpleName()+"가 컨텐츠2 (을)를 이용할 수 있습니다.");
    }

    //관리자 제한
    public static void accessContent3(Available<? super Admin> user){
        System.out.println(user.user.getClass().getSimpleName()+"가 컨텐츠3 (을)를 이용할 수 있습니다.");
    }
}
