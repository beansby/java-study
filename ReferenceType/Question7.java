package ReferenceType;

/**
 * 주어진 배열 항목에서 최대값 출력 코드 작성(for문 이용)
 * int[] array = {1,5,3,8,2};
 */
public class Question7 {
    public static void main(String[] args) {
        int[] array = { 1, 5, 3, 8, 2};
        int max = 0;
        for (int i=0; i<array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println(max); //8
    }
}
