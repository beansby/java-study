package Part13.TypeParameter.WildCard;

public class GenericExample {
    public static void main(String[] args) {
        //모든 유저
        Content.accessContent1(new Available<User>(new User()));
        Content.accessContent1(new Available<Admin>(new Admin()));
        Content.accessContent1(new Available<General>(new General()));
        Content.accessContent1(new Available<PaidUser>(new PaidUser()));
        Content.accessContent1(new Available<FreeUser>(new FreeUser()));

        System.out.println();
        //관리자
        Content.accessContent3(new Available<User>(new User()));
        Content.accessContent3(new Available<Admin>(new Admin()));
//        Content.accessContent3(new Available<General>(new General()));
//        Content.accessContent3(new Available<PaidUser>(new PaidUser()));
//        Content.accessContent3(new Available<FreeUser>(new FreeUser()));

        System.out.println();

        //일반사용자
//        Content.accessContent2(new Available<User>(new User()));
//        Content.accessContent2(new Available<Admin>(new Admin()));
        Content.accessContent2(new Available<General>(new General()));
        Content.accessContent2(new Available<PaidUser>(new PaidUser()));
        Content.accessContent2(new Available<FreeUser>(new FreeUser()));
    }
}
