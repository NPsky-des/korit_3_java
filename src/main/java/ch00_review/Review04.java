package ch00_review;

import java.util.Scanner;

public class Review04 {
    public static void main(String[] args) {
        /*
            for 반복문
            for(시작값 ; 한계값 ; 증감값) {
                반복실행문
            }
            시작값에는 처음 선언하는 변수여야 오류를 막을 수 있습니다.

            for(시작값 ; 한계값 ; 증감값) {
                반복실행문1
                while / if / for() {
                    반복실행문2
                }
                반복실행문3
            }
         */

//        int limitNumber = 100;

//        for (int i = 0 ; i < limitNumber ; i++) {
////            System.out.print(i + " ");
//            // 여기 내부에 if문을 써서 1부터 limitNumber까지의 숫자 중
//            // 짝수만 뽑아낼 수 있도록 하는 조건문을 작성하시오.
//            int addedI = i+1;
//            if(addedI % 2 == 0) {
//                System.out.print(addedI + " ");
//            }
//        }

        // i 는 index의 줄임말

        // 이상의 코드를 응용할 겁니다. while문으로 개조할 겁니다.
        // 근데 짝수 말고 홀수가 출력되도록 작성하시오.

//        int i = 1;
//        while(i < 100){
//            if(i % 2 == 1) {
//                System.out.print(i + " ");
//                i++;
//            }
//        }

//        int n = 1;
//        while(n < limitNumber+1) {
//            // if문
//            if(n % 2 == 1){
//                System.out.print(n + " ");
//            }
//            n++;
//        }

        /*
            여태까지 제가 코드를 작성하는 방식을 봤을 때
            사용하는 클래스들을 import -> 엔터 두 번 친 다음에 사용할 변수목록


         */

        // 사용할 클래스 목록(객체 생성)
        Scanner scanner = new Scanner(System.in);

        // 사용할 변수 목록
        double score = 0;
        int numOfStudent = 0;
        double sum = 0;     // 합
        double avg = 0;     // 평균

//        System.out.print("학생의 수는 몇 명인가요? >>> ");
//        numOfStudent = scanner.nextInt();

        /*
            이상과 같은 코드라인이 있을 때 sum / avg는 아직 사용되지도
            않았는데 미리 선언되어있고,
            numOfStudent의 경우에는 몇 줄만 더 내려가면 쓰는데
            굳이 저 위에 꾸역꾸역(ㅜㅜ) 써놨습니다.

            그런데 사용할 클래스 및 변수 목록을 봤을 때 (그리고 변수명을
            해석했을 때), 학생 수와 점수를 입력 받아서 합을 구하고
            평균을 내는 방식으로 이루어질 거라는 유추가 가능합니다.

            또한, Java 코딩에 익숙하시다면
            학생 개개인의 점수를 입력할 수 있도록 하는
            score1, score2의 형태가 아니라 sum만 존재한다는 점에서
            for 반복문 내부에 sum += 이 사용될 거라는 것도 추론하실 수 있습니다.

            이상의 추론을 바탕으로 저희가 반복문을 작성해보자면
         */
//        int n = 1;      // while 반복문을 쓸 때에 입력이 되어야
//        double score = 0;
//        while (n <= numOfStudent){
//            System.out.print("점수를 입력하세요 >>> ");
//            score = scanner.nextDouble();
//            sum += score;
//
//            n++;
//        }
//        System.out.println("총합 : " + sum);
//        avg = sum / numOfStudent;
//        System.out.println("평균 : " + avg);

//        System.out.print("학생의 수는 몇 명인가요? >>> ");
//        numOfStudent = scanner.nextInt();
//
//        for(int i = 0 ; i < numOfStudent ; i++){
//            System.out.print("점수를 입력하세요 >>> ");
//            sum = scanner.nextInt();
//        }
//        System.out.println("총합 : " + sum);
//        System.out.println("평균 : " + avg);




        System.out.print("학생의 수는 몇 명인가요? >>> ");
        numOfStudent = scanner.nextInt();

        for(int i = 0 ; i < numOfStudent ; i++) {
            System.out.print("시험 점수를 입력하세요 >>> ");
            score = scanner.nextDouble();
            if ( score < 0 || score > 100 ) {
                System.out.println("불가능한 점수 입력입니다.");
                System.out.println("종료합니다. 처음부터 다시 입력하세요.");
                break; //이러면 반복문 바로 종료
            }
            sum += score;
        }
        System.out.println("총합 : " + sum);
        avg = sum / numOfStudent;
        System.out.println("평균 : " + avg);
    }
}
