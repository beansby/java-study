package Part13.GenericType.Class;

public class GenericExample {
    public static void main(String[] args) {
        Apple<iPhone, String, String> iphone13 = new Apple<>();

        iphone13.setModel(new iPhone());
        iphone13.setType("256GB");
        iphone13.setColor("silver");

        iPhone iPhone = iphone13.getModel();
        String iphone13_type = iphone13.getType();
        String iphone13_color = iphone13.getColor();

        System.out.println(iPhone +" "+ iphone13_type +" "+ iphone13_color);


        Apple<MacBook, String, String> macPro = new Apple<>();

        macPro.setModel(new MacBook());
        macPro.setType("512GB");
        macPro.setColor("space grey");

        MacBook macBook = macPro.getModel();
        String macPro_type = macPro.getType();
        String macPro_color = macPro.getColor();

        System.out.println(macBook +" "+ macPro_type +" "+ macPro_color);
    }
}
