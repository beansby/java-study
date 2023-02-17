package Part12.Annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ChatAnnotationEx {
    public static void chat(ChatAnnotation chatAnnotation){
        //어노테이션이 적용되어 있을 경우
        if(chatAnnotation != null){
            //필드 속성값 얻기
            String name = chatAnnotation.name();
            int age = chatAnnotation.age();
            System.out.print(name + "(" + age + ") :");
        }
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Method[] declaredMethods = ChatService.class.getDeclaredMethods();
        for(Method method : declaredMethods){
            //ChatAnnotation 얻기
            ChatAnnotation chatAnnotation = method.getAnnotation(ChatAnnotation.class);
            //설정 정보 이용
            chat(chatAnnotation);
            //메소드 호출 : chat1(), chat2()
            method.invoke(new ChatService());
        }
    }
}
