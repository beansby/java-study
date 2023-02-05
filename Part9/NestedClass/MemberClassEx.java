package Part9.NestedClass;

public class MemberClassEx {
    public static void main(String[] args) {
        //인스턴스 멤버 클래스 객체 생성 : OuterClass 외부
        // 1-OuterClass 객체 생성
        OuterClass outerClass = new OuterClass();
        // 2-인스턴스 멤버 클래스 객체 생성
        OuterClass.InstanceMemberClass instanceMemberClass = outerClass.new InstanceMemberClass();

        outerClass.method();

        //정적 멤버 클래스 객체 생성 : OuterClass 외부
        OuterClass.StaticMemberClass staticMemberClass = new OuterClass.StaticMemberClass();
    }
}
