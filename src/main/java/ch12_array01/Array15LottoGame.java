package ch12_array01;

import java.util.Arrays;
import java.util.Random;

/*
    1차 배열을 기준으로
    1 ~ 45까지의 임의의 숫자를 뽑아 배열에 대입

    목표는 1차 배열 내에 6개의 임의의 int 값을 집어넣는 것
    근데, 중복이 있으면 안 됨. -> 강사님이랑 같이 수업

    그래서 복습을 한다고 가정하고 1 ~ 45까지의 숫자를
    여섯 개짜리의 빈 배열에 집어넣는 것부터 시작겠습니다.

    lottoNumbers에 1 ~ 45까지의 숫자 중 6개를 뽑아 대입하는 반복문 작성
    -> 1차 배열 하나가 완성됩니다.

    그 1차 배열이 10번 반복되게끔 반복문 작성
    -> 그럼 전체적으로 2중 for문이 됩니다. (혹시 while문으로 작성하고 싶다면
    그래도 됩니다.)
 */
public class Array15LottoGame {
    public static void main(String[] args) {

        // 객체 생성
        Random random = new Random();
        // 생각해봐야할 점
        // Math.random()을 사용해서 1~45까지의 범위를 만들려면 어떡해야 할까

//        Integer[] numbers = new Integer[6];
//
//        for( int i = 0 ; i < numbers.length ; i++ ) {
//            numbers[i] = (int)(Math.random()*45) + 1;
//        }
//
//        for( int i = 0 ; i < numbers.length ; i++ ) {
//            numbers[i] = (int)(Math.random()*45) + 1;
//        }
//
//        for (int number : numbers) {
//            System.out.print((number*10) + " ");
//        }



        // 빈 배열 선언
        int[] lottoNumbers = new int[6];

        // 게임 횟수
        int round = 5;      // 얘를 이용하여 게임 횟수를 5번 반복하시오.

        for(int j = 0 ; j < round ; j++){
            for(int i = 0 ; i < lottoNumbers.length ; i++) {
                lottoNumbers[i] = (int)(Math.random()*45)+1;
//                System.out.print(lottoNumbers[i] + " ");      // 이건 오름차순 없이 나열
            }
//            Arrays.sort(lottoNumbers);          // 오름차순
            System.out.println(Arrays.toString(lottoNumbers));
        }




//        System.out.println(Math.random());


    }
}
