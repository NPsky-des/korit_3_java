package ch10_setter_getter;

public class PersonMain {
    public static void main(String[] args) {

        Person person1 = new Person(-10);
        System.out.println(person1.getName());      // 값은 들어가지 않았지만 객체는 생성됨
        System.out.println(person1.getAge());
//        person1.name = "이정화";
//        System.out.println(person1.name);
//        System.out.println(person1.age);
//        person1.age = 27;     // private 적용 후에 오류 발생해서 4줄 주석처리합니다.


        // private 의 반댓말이 public입니다.

        // 메서드 호출 방식 : 객체명.메서드명()
        person1.setName("이정화");
        person1.setAge(27);
        person1.setAge(300);

        System.out.println(person1.getName());

        person1.setName("레오나르도디카프리오");
        System.out.println(person1.getName());
        System.out.println();
        person1.setName("이정화");
        System.out.println(person1.getName());
    }
}
