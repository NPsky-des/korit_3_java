package ch12_inheritance.book;

import ch12_inheritance.products.Product;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석", "남궁성");

        System.out.println("이 책의 제목은 " +  book1.getTitle() + "입니다.");
        System.out.println("이 책의 저자는 " + book1.getAuthor() + "입니다.");

//        EBook eBook1 = new EBook ("스프링 입문", "이강준", 5.2, "EPUB");
//        eBook1.setFormat("PDF");
//        System.out.println("이 책의 포맷은 " + eBook1.getFormat);

//        eBook1.displayInfo();


    }
}
