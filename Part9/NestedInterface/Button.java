package Part9.NestedInterface;

public class Button {
    //정적 중첩 인터페이스 : 외부 접근 가능(public)
    public static interface ClickListener {
        void onClick();
    }

    //인터페이스 타입 필드
    private ClickListener clickListener;

    //setter
    public void setClickListener(ClickListener clickListener) {
        //필드 = 매개변수(인터페이스 구현 객체)
        this.clickListener = clickListener;
    }

    //Button 메소드 : 인터페이스 필드 => 추상메소드 호출
    public void click(){
        this.clickListener.onClick();
    }
}
