package ch18_generic.wildcard;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnimalData<T> {
    private T animal;

    // 지금 AnimalData의 필드인 animal에 Animal 클래스의 상속을 받은
    // Tiger / Human 객체를 필드에 대입할 예정

    // 특정 클래스라면(즉 Animal의 상속을 받은 서브클래스라면)
    // 해당 클래스에 맞는 객체 정보를 출력하도록 할 예정
    public void printData() {
        ((Animal) animal).move();
        // AnimalData의 필드인 animal을 Animal 타입으로 형변환하고,
        // .move() 메서드를 호출

        if(animal.getClass() == Human.class){
            ((Human)animal).read(); // 현재 필드인 animal의 클래스를 조사하여
            // (.getCalss()를 통해) 그것이 Human 클래스라면,
            // Human 고유 메서드를 실행
        } else if (animal.getClass() == Tiger.class){
            ((Tiger)animal).hunt();
        }
    }
}
