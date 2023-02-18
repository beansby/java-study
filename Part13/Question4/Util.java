package Part13.Question4;

public class Util {
    //정적 메소드
    public static <K, V> V getValue(Pair<K, V> pair, K key){
        if (pair.getKey() == key){
            return pair.getValue();
        } else {
            return null;
        }
    }
}
