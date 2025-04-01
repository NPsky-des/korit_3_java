package ch17_static.builders;

public class PersonMain {
    public static void main(String[] args) {
        // Person 객체인 person1 을 만든다고 가정하겠습니다.

//        Person person1 = new Person("이정화", 27, "부산광역시 남구");
        // 이상이 여태까지의 방식이었고
        // 빌더 적용 시에는
        Person person1 = new Person.Builder()
                .name("이정화")
                .age(27)
                .address("부산광역시 남구")
                .build();

        System.out.println(person1);
    }
}
