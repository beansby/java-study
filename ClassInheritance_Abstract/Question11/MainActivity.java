package ClassInheritance_Abstract.Question11;

public class MainActivity extends Activity{
    @Override
    public void onCreate() {
        super.onCreate(); //super
        System.out.println("추가적인 실행 내용");
    }

    public static void main(String[] args) {
        MainActivity mainActivity = new MainActivity();
        mainActivity.onCreate();
        // 기본적인 실행 내용
        // 추가적인 실행 내용
    }
}
