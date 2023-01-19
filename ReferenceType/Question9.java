package ReferenceType;

import java.util.Scanner;

/**
 * 학생들의 점수를 분석하는 프로그램을 만드려고 한다. 
 * 키보드로부터 학생 수와 각 학생들의 점수를 입력받고, while문과 Scanner의 nextLine() 메소드를 이용해
 * 최고 점수 및 평균 점수를 출력하는 코드 작성
 */
public class Question9 {
    public static void main(String[] args) {
        // 실행
        boolean run = true;
        
        // 입력값
        Scanner scanner = new Scanner(System.in);
        
        while (run){
            System.out.println("-----------------------------------------------");
            System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
            System.out.println("-----------------------------------------------");
            System.out.print("선택> ");

            int choice = scanner.nextInt();
            int student = 0;
            int[] scores = null;
            
            switch (choice) {
                case 1 :
                    System.out.print("학생수> ");
                    student = scanner.nextInt();
                    scores = new int[student];
                    break;
                case 2 :
                    for(int i=0; i<scores.length; i++){
                        System.out.print("scores["+i+"]> ");
                        int score = scanner.nextInt();
                        scores[i] = score;
                    }
                    break;
                case 3 :
                    for(int i=0; i<scores.length; i++){
                        System.out.println("scores["+i+"]: " + scores[i]);
                    }
                    break;
                case 4 :
                    int max = 0;
                    double avg = 0.0;
                    int sum = 0;
                    int count = 0;

                    for (int i=0; i<scores.length; i++){
                        // 평균
                        sum += scores[i];
                        count++;
                        // 최고
                        if (max < scores[i]){
                            max = scores[i];
                        }
                    }
                    avg = (double) sum / count;

                    System.out.println("최고 점수: " + max);
                    System.out.println("평균 점수: " + avg);
                    break;
                case 5 :
                    run = false;
                    System.out.println("프로그램 종료");
                    break;
            }
        }
    }
}
