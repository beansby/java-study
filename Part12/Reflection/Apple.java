package Part12.Reflection;

public class Apple {
    //필드
    private String model;
    private String serialNo;

    //생성자
    public Apple() {
    }
    public Apple(String model) {
        this.model = model;
    }

    //메소드
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getSerialNo() {
        return serialNo;
    }
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
}
