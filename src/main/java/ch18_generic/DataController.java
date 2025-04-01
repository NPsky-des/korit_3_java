package ch18_generic;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        Date now = new Date();  // Java 내장 클래스로 객체 생성

        ResponseData<String> responseData1 =
                new ResponseData<>("날짜 저장 성공", now.toString());

        ResponseData<Integer> responseData2 =       // 제네릭 T는 클래스 타입을 나타낼 때이기 때문에 자료형인 int 대신 Integer
                new ResponseData<>("나이 표시 : ", 27);

        ResponseData<Date> responseData3 =
                new ResponseData<>("날짜 객체 저장 성공", now);

        System.out.println(responseData1);
        System.out.println(responseData2);
        System.out.println(responseData3);
        
    }
}
