package ch10_setter_getter.univ_student;

import ch10_setter_getter.Person;

public class UnivStudentMain {
    public static void main(String[] args) {

        //객체 생성
//        UnivStudent student1 = new UnivStudent("김일", 1, 3.3);
//        UnivStudent student2 = new UnivStudent("김이", 3, -30);
//        UnivStudent student3 = new UnivStudent("김삼", 5, 2.7);
//        UnivStudent student4 = new UnivStudent("김사", 4, 3.8);
//        UnivStudent student5 = new UnivStudent("김오", 2, 1.0);
        UnivStudent student1 = new UnivStudent();
        UnivStudent student2 = new UnivStudent();
        UnivStudent student3 = new UnivStudent();
        UnivStudent student4 = new UnivStudent();
        UnivStudent student5 = new UnivStudent();

//        student2.setGrade(-30);
//        student2.setGrade(4);
//        student3.setScore(5);
//        student3.setScore(2);

        // 객체에 값 대입 -> 실패한 후까지 고려하여 성공까지 다 집어넣었습니다.
        student1.setName("김일");
        student1.setGrade(1);
        student1.setScore(3.3);

        student2.setName("김이");
        student2.setGrade(3);
        student2.setScore(-30);

        student3.setName("김삼");
        student3.setGrade(5);
        student3.setScore(2.7);

        student4.setName("김사");
        student4.setGrade(4);
        student4.setScore(3.8);

        student5.setName("김오");
        student5.setGrade(2);
        student5.setScore(1.0);

        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
        student5.showInfo();
    }
}
