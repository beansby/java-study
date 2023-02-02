package NestedClass.Question7;

/**
 * Chatting 클래스 컴파일 에러 원인 설명
 */
public class Chatting {
    // 인스턴스 멤버 클래스 Chat
    class Chat {
        void start() {}
        void sendMessage(String message){}
    }

    // 바깥 클래스의 메소드
    void startChat(String chatId){
        // 바깥 클래스 메소드의 로컬 변수
        // 메소드 내부 필드 = final?
//        String nickName = null;
//        nickName = chatId;

        String nickName = chatId;

        // 익명 자식 객체 Chat (local variable)
        // 메소드 필드 읽기만 가능, 변경 불가
        // 로컬 클래스 : 로컬클래스에서 로컬 변수를 사용하려면 final 특성을 가짐
        Chat chat = new Chat(){
            @Override
            public void start() {
                while(true){
                    String inputData = "안녕하세요";
                    String message = "[" + nickName + "]" + inputData;
                    sendMessage(message);
                }
            }
        };

        chat.start();
    }
}
