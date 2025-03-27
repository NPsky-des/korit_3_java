package ch12_array01;

import java.util.Arrays;
import java.util.Random;

public class Array17LottoClean {
    public static void main(String[] args) {
        Random random = new Random();

        int[] lottoNumbers = new int[6];

        int round = 5;
        int temp = 0;
        boolean duplicate;

        for(int j = 0 ; j < round ; j++) {
            for (int i = 0; i < lottoNumbers.length; i++) {
                duplicate = false;
                temp = (int) (Math.random() * 45) + 1;

                for (int k = 0; k < i; k++) {
                    if (lottoNumbers[k] == temp) {
                        duplicate = true;

                    }
                }

                if (!duplicate) {
                    lottoNumbers[i] = temp;
                } else {
                    i--;
                }
            }
            Arrays.sort(lottoNumbers);
            System.out.println(Arrays.toString(lottoNumbers));
        }
    }
}
