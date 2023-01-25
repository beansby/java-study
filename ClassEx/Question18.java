package ClassEx;

/**
 * 다음 예제 코드가 실행되면 "같은 ShopService 객체입니다." 라는 메세지가 출력되도록,
 * 싱글톤 패턴을 사용해 ShopService 클래스 작성
 */
class ShopService {
    private static ShopService shopService = new ShopService();

    private ShopService() {
    }

    public static ShopService getInstance(){
        return shopService;
    }
}

public class Question18 {
    public static void main(String[] args) {
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은 ShopService 객체입니다.");
        } else {
            System.out.println("다른 ShopService 객체입니다.");
        }
    }
}
