package ReferenceType;

/**
 * 주어진 배열 항목의 전체 합과 평균 출력하는 코드 작성 (중첩 for문 이용)
 * int[][] array = {
 *             {95, 86},
 *             {83, 92, 96},
 *             {78, 83, 93, 87, 88}
 *         };
 */
public class Question8 {
    public static void main(String[] args) {
        int[][] array = {
            {95, 86},
            {83, 92, 96},
            {78, 83, 93, 87, 88}
        };

        // 전체 합
        int sum = 0;
        // 평균 : int -> double 타입 수정
//        int avg = 0;
        double avg = 0.0;
        int num = 0;

        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                sum += array[i][j];
                num++;
            }
        }

        System.out.println(sum); //881
        avg = (double) sum / num;
        System.out.println(avg); //88.1
    }
}
