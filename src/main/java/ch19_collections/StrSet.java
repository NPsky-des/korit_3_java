package ch19_collections;

import java.util.*;

/*
    List는 순서가 있고, 중복을 허용하는 반면
    Set의 경우 수ㅜㄴ서는 없고 중복은 허용하지 않기 때문에
    List -> set / 혹은 Set -> List로의 형변환이 중요합니다.
    List를 통해 전체 설문을 받고, Set을 통해 중복을 제거하여
    후보군을 남기는 등의 형태로 많이 사용됩니다.
    또한 Set으로 중복을 제거한 후 .get(인덱스넘버)로 조회도 가능하겠죠.
 */
public class StrSet {
    // Set 객체 생성
    Set<String> strSet = new HashSet<>();
    // List 객체 생성
    List<String> strList = new ArrayList<>();

    //Set에 element 삽입 -> .add()

    // Key Set 출력 - > strMap 제네릭의 첫 번째 매개변수인 key에 해당하는 자료형을 넣어야 함
    // Value Set 출력 -> strMap 제네릭의 두 번째 매개변수인 value에 해당하는 자료형을 넣어야 함

    // key는 중복이 없는데 value는 중복이 있을 수 있어서 set으로 direct 생성 불가능
    // key는 중복이 불가능하기 때문에 Set을 쓰는데,
    // value는 중복 허용이 되기 때문에 Set을 썼을 경우 중복 제거로 인해
    // 키의 개수와 값의 개수가 달라지게 될 위험성이 있어 Collection을 사용함 (Collections가 아닙니다.)

    public static void main(String[] args) {
        // Set 객체 생성
        Set<String> strSet = new HashSet<>();
        // List 객체 생성
        List<String> strList = new ArrayList<>();

        // 리스트 정렬한 버전을 set에 저장하기 위해 추가적으로 하나 더 선언
        Set<String> strSetModified = new HashSet<>();

        // Set에 element 삽입 -> .add()
        strSet.add("java");
        strSet.add("java");
        strSet.add("java");
        strSet.add("python");
        strSet.add("1");
        strSet.add("1");
        strSet.add("2");
        strSet.add("2");
        strSet.add("3");
        strSet.add("3");
        strSet.add("3");

        // Set의 출력
        System.out.println(strSet); // 순서를 보장 x

        // 특정 element의 추출 -> List로의 형변환
        strList.addAll(strSet);
        // List로 바꿨으니까 요소 추출 가능
        // 일반 for문으로
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
        // 정렬하세요.
        Collections.sort(strList);
        // 다시 요소 추출
        // 향상된 for문
        for (String elem : strList) {
            System.out.println(elem);
        }
        // 그렇다면 다시 strSet으로 옮기려면
        strSetModified.addAll(strList);

        System.out.println(strSetModified);
    }
}
