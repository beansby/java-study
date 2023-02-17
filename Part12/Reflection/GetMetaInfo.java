package Part12.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetMetaInfo {
    private static void printParams(Class[] params){
        for(int i=0; i<params.length; i++){
            System.out.print(params[i].getName());
            if(i< (params.length-1)){
                System.out.println(",");
            }
        }
    }

    public static void main(String[] args) {
        // 1) Class 객체 얻기
        Class apple = Apple.class;
        // 2)
//        Class obj2 = Class.forName(Part12.Reflection.Apple);
        // 3)
//        Apple apple = new Apple();
//        Class obj3 = apple.getClass();

        System.out.println("--------------- 패키지&타입 정보 ----------------");
        System.out.println("패키지명 :" + apple.getPackageName());
        System.out.println("간단한 클래스명 : " + apple.getSimpleName());
        System.out.println("전체 클래스명 : " + apple.getName());

        System.out.println("--------------- 멤버 정보 ----------------");
        System.out.println("[생성자 정보]");
        Constructor[] constructors = apple.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            System.out.print(constructor.getName() + "(");
            Class[] params = constructor.getParameterTypes();
            printParams(params);
            System.out.print(")");
            System.out.println();
        }

        System.out.println("[필드 정보]");
        Field[] fields = apple.getDeclaredFields();
        for(Field field : fields){
            System.out.print(field.getType().getName() +" "+ field.getName());
            System.out.println();
        }

        System.out.println("[메소드 정보]");
        Method[] methods = apple.getDeclaredMethods();
        for(Method method : methods){
            System.out.print(method.getName() + "(");
            Class[] params = method.getParameterTypes();
            printParams(params);
            System.out.print(")");
            System.out.println();
        }

        System.out.println("--------------- 리소스 경로 ----------------");
        String filePath = apple.getResource("resource.jpg").getPath();
        System.out.println(filePath);
    }
}
