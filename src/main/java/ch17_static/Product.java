package ch17_static;

import lombok.Getter;

@Getter

public class Product {

    // 필드 선언
    // static 변수 (정적 변수)를 선언 및 초기화
    @Getter //필드 레벨에서의 getter
    private static int count = 0;
    //멤버 변수 선언 및 초기화
    private int instanceCount = 0;      // 변수인데 여기에 초기화도 했습니다.

    public Product() {
        System.out.println("Product 클래스의 인스턴스가 생성되었습니다.");
        count++;
        instanceCount++;
    }
}
