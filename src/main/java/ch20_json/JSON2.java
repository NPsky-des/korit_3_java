package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Data
class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        // 사용할 변수 선언 -> Json 데이터는 자료형이 String입니다.
        String userJson = null;
        String studentJson = null;
        String productJson = null;

        // 1. Java Object -> json으로의 변환 사례

        // user1 객체를 생성하고 "jim1", "9876", "a@test.com", "김일", "20"으로 입력하시오
        User user1 = new User("kim1", "9876", "a@test.com", "김일", "20");
        // JSON1을 참조하여 gson을 통한 JSON 데이터로 변경을 시도하세요. -> 그리고 콘솔 출력
        System.out.println("json 형태로 변환 : " + gson.toJson(user1));
        // 객체 그대로 출력하면
        System.out.println("java 객체 형태로 출력 : " + user1);
        // 동일하게 gsonBuilder를 통해 JSON 데이터로 변경을 시도하세요. -> 그리고 콘솔 출력
        System.out.println("prettyPrinting 적용 후 출력 : \n" + gsonBuilder.toJson(user1));

        // gsonBuilder를 통한 결과값을 userJson에 대입하세요.
        userJson = gsonBuilder.toJson(user1);       // Json 데이터가 String인 게 증명됩니다.

        // 2. JsonObject -> json으로의 변환 사례
        // JsonObject를 활용하여 studentCode 2025001 / studentName 김이 / studentYear 2 / score 96.7인 객체를 생성하시오.
        // 참고로 key value 다 String으로 잡아놓겠습니다.

        // JsonObject 클래스의 인스턴스 생성
        JsonObject jsonObject = new JsonObject();

        // .addProperty()를 활용하여 이상에서 제공된 데이터를 입력한다.
        jsonObject.addProperty("studentCode", "2025001");
        jsonObject.addProperty("studentName", "김이");
        jsonObject.addProperty("studentYear", "2");
        jsonObject.addProperty("score", "96.7");

        //gsonBuilder를 활용하여, .toJson()을 이용, json 데이터로 변환한다.
        // 이상의 코드를 studentJson에 대입한다.
        studentJson = gsonBuilder.toJson(jsonObject);
        System.out.println(studentJson);

        // 3. Map -> json으로의 활용 사례
        /*
            Map을 활용하여 key String / value String으로 선언하고, 객체명을 map으로 한
            빈 map을 생성하시오.

            ㅓ'ㅑㅣㅏㅟ'ㅣㅏㅓ'ㅑㅑㅏㅣㅏㅓㅟㅏㅟㅏㅓㅣㅏㅓㅣ
            map에 productCode NT960XHA-KD72G
            productName 삼성 갤럭시북 프로 5
            라는 Entry(key-value pair)를 입력하시오.

            gsonBuilder를 활용하여 json으로 바꾸고 productJson에 대입하시오.
            sout(productJson) 하시오
            ㄴ야ㅔ럼재햐넣ㅁㄴㅇㅁ
         */

        Map<String, String> map = new HashMap<>();

        // map에다가 entry 집어넣는 method -> .put();

        map.put("productCode", "NT960XHA-KD72G");
        map.put("productName", "삼성 갤럭시북 프로 5");

        System.out.println(map);

        productJson = gsonBuilder.toJson(map);
        System.out.println(productJson);

        // 근데 그러면 json -> 객체 / map으로 바꾸려면 어떻게 하면 될까
        // user / jsonObject
        // 형식 :
        // gson.fromJson(제이슨데이터, 바꾸고자하는 클래스);

        // json -> map
        Map<String, String> map2 = gson.fromJson(productJson, Map.class);
        System.out.println(map2);

        // json -> user
        // 그러면 userJson을 User 클래스의 user2에 대입하려면 어떡하면 될까요
        //뭐라는거야ㅔ'[ㅔ;ㅣㅏ['ㅣㅐㅏ,'[;ㅣ';,;ㅐㅣㅓ
        User user2 = gson.fromJson(userJson, User.class);
        System.out.println(user2);

        // json -> jsonObject
        // 그러면 studentJson을 jsonObject2로 대입하려면 어떡하면 될까요
        JsonObject jsonObject2 = gson.fromJson(studentJson, JsonObject.class);
        System.out.println(jsonObject2);


    }
}
