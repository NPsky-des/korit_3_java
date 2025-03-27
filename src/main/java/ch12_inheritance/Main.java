package ch12_inheritance;
/*
    패키지 명 위에 확인하시고
    Animal
    Human
    Tiger
    Main 파일들을 만드세요.


 */
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("나비");
        Animal animal3 = new Animal(1);
        Animal animal4 = new Animal("바둑이", 2);


        // Animal 클래스의 객체를 만들 때 각각의 생성자를 호출했는데, 만약에 저희가
        // Dog와 Cat에 각각 dogName / catName 필드를 생성하고, 또 생성자 만들고
        // dog1과 cat1이라는 객체를 생성했었을 겁니다.
        // 상속을 사용했을 때를 보기 위해 Tiger 클래스로 가겠습니다.

        // Tiger 객체를 생성
        Tiger tiger1 = new Tiger();
        tiger1.setAnimalName("푸바오");
        tiger1.setAnimalAge(4);

        System.out.println(tiger1.getAnimalName() + "는 올해 " + tiger1.getAnimalAge() + "살입니다.");

        tiger1.move();      // super.move() 일 경우 -> 움직입니다 출력
        tiger1.hunt();
        animal1.move();
//        animal1.hunt();     // 부모 클래스가 자식 클래스의 메서드를 사용할 수는 없음




        System.out.println();
        Human human1 = new Human();

        human1.setAnimalAge(27);
        human1.setAnimalName("이정화");

        System.out.println("안녕하세요, 제 이름은 " + human1.getAnimalName() + "이고, 나이는 " + human1.getAnimalAge() + "입니다.");
        System.out.println("내년에는 " + (human1.getAnimalAge() + 1) + "살이 됩니다.");
        human1.move();
        human1.read("자바의 기초");



    }
}
