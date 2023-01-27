package InterfaceEx.Question7;

/**
 * DaoExample 클래스의 main() 메소드에서 dbWork() 메소드 호출시 OracleDao 와 MySqlDao 객체를 매개값으로 주고 호출.
 * dbWork() 메소드는 두 객체를 모두 매개값으로 받기 위해 DataAccessObject 타입의 매개변수를 가지고 있다.
 * DataAccessObject 인터페이스와 OracleDao, MySqlDao 구현 클래스 작성
 */
public class DaoExample {
    public static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());
        /*
        Oracle DB에서 검색
        Oracle DB에서 삽입
        Oracle DB에서 수정
        Oracle DB에서 삭제
        MySql DB에서 검색
        MySql DB에서 삽입
        MySql DB에서 수정
        MySql DB에서 삭제
        */
    }
}
