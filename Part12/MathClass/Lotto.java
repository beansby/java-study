package Part12.MathClass;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        // 1) 랜덤 난수 : Math 클래스 random() 메소드
        //로또 선택번호 배열
        int[] select = new int[6];

        //1~45 사이의 랜덤 정수 6개 구하기
        for(int i=0; i<=5; i++){
            int number = (int)(Math.random()*44)+1;
            for(int j=0; j<=i; j++){
                if(number != select[j]){
                    select[i] = number;
                }
            }
        }

        System.out.print("로또 선택 번호 : ");
        for (int i=0; i<=5; i++){
            System.out.print(select[i]+" ");
        }

        System.out.println();

        // 2) 랜덤 난수 : java.util.Random 클래스
        //로또 당첨번호 배열
        int[] winner = new int[6];

        //Random 객체 생성
        Random random = new Random(1);

        System.out.print("로또 당첨 번호 : ");
        for (int i=0; i<=5; i++){
            winner[i] = random.nextInt(45)+1;
            System.out.print(winner[i]+" ");
        }

        System.out.println();

        //당첨 확인
        //배열 정렬
        Arrays.sort(select);
        Arrays.sort(winner);
        //배열 비교
        boolean result = Arrays.equals(select, winner);
        System.out.print("당첨 결과 : ");
        if (result) {
            System.out.println("1등에 당첨되셨습니다.");
        } else {
            System.out.println("당첨되지 않았습니다.");
        }
    }
}
