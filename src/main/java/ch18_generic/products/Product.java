package ch18_generic.products;

import lombok.AllArgsConstructor;
import lombok.Data;
/*
    1. ProductController.java를 생성하시고, 다양한 타입의
    상품 정보를 저장하고, 출력하는 코드를 작성하ㅣㅅ오.

    실행 예
        Product(productName=Laptop, productInfo=Intel i7, 16GB RAM, 512GB SSD) String
        Product(productName=Smartphone, productInfo=799.99) Double
        Product(productName=Available, productInfo=true)    Boolean

 */
@Data
@AllArgsConstructor
public class Product<T> {
    private String productName;
    private T productInfo;
}