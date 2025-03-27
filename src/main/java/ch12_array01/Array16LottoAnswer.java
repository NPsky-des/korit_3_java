package ch12_array01;

import java.util.Arrays;
import java.util.Random;

public class Array16LottoAnswer {

    public static void main(String[] args) {

        // 객체 생성
        Random random = new Random();
        // 생각해봐야할 점
        // Math.random()을 사용해서 1~45까지의 범위를 만들려면 어떡해야 할까



        // 빈 배열 선언
        int[] lottoNumbers = new int[6];

        // 게임 횟수
        int round = 5;      // 얘를 이용하여 게임 횟수를 5번 반복하시오.
        int temp = 0;       // 자주 쓰는 변수명으로 temporary의 축약어
        boolean duplicate;  // 중복이 되었을 때 true로 바꿔서 조건문을 실행시킬 예정(재대입을 위해)

        for(int j = 0 ; j < round ; j++){
            for(int i = 0 ; i < lottoNumbers.length ; i++) {
                duplicate = false;      // 얘가 여기 있어야만 하는 이유가 좀 중요함.
                temp = (int)(Math.random()*45) +1 ;
                // temp에 들어간 난수가 이전 배열의 element와 같이 겹치는지를 확인해야 함.
                for (int k = 0 ; k < i ; k++){  // 중복을 체크하기 위해 현재 만들어져서 element가 대입된 부분까지만 탐색
                    if(lottoNumbers[k] == temp) {
                        duplicate = true;       // 얘가 true가 됐으면 조건문이 하나 더 필요합니다.

                    }
                }

                if(!duplicate) {        // duplicate가 false라면 !duplicate가 true이므로 중복이 없다는 의미
                    lottoNumbers[i] = temp;
                } else {
                    // 대입이 아니라 다시 뽑아야 함.
                    i--;
                    // i = 3일 때 예를 들어서 얘가 시ㅣㄹ행이 됐다면
                    // i = 2 로 바뀌게 됩니다.
                }
                // 여기까지 내려와서 for(int i 파트의 반복문이 끝이 나게 되면
                //i++가 적용되면서 다시 3일 때 temp를 ㅇㄻ
                //
            }
//            Arrays.sort(lottoNumbers);          // 오름차순
            System.out.println(Arrays.toString(lottoNumbers));
        }
    }

}
