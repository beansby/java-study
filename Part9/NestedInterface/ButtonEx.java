package Part9.NestedInterface;

public class ButtonEx {
    public static void main(String[] args) {
        //Submit 버튼 객체 생성
        Button btnSubmit = new Button();

        /*
        //ClickListener 구현 클래스(로컬 클래스) : submit 버튼 클릭 이벤트 처리
        class SubmitListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("submit 버튼을 클릭했습니다");
            }
        }

        //Submit 버튼 객체에 ClickListener 구현 SubmitListener 객체 주입
        //주입하지 않을시 nullpointException
        btnSubmit.setClickListener(new SubmitListener());
        */

        btnSubmit.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("submit 버튼을 클릭했습니다");
            }
        });


        btnSubmit.click();


        //Login 버튼 객체 생성
        Button btnLogin = new Button();

        class LoginListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("login 버튼을 클릭했습니다");
            }
        }

        btnLogin.setClickListener(new LoginListener());
        btnLogin.click();

    }
}
