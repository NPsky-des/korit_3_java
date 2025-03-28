package ch14_casting.centralcontrol;

import ch13_abstraction.abstract_class.Factory;

public class CentralControl {
    // 필드 선언
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    // 전자제품들을 CentralControl의 객체의 필드인 배열에 집어넣는 메서드
    public void addDevice(Power device) {
        // 왜 매개변수가 Power인가를 고려할 필요
        int emptyIndex = checkEmpty();
        if(emptyIndex == -1) {
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 연결되었습니다.");
    /*
        객체명.getClass() -> 패키지 명을 포함한 클래스명이 출력되는 getter
        객체명.getClass().getSimpleName() -> 클래스명만 출력되는 getter
     */
    }

    // 지금 보니까 배열 개수는 정해져있는데 객체가 너무 많으면 문제 생길 것 같아서
    // 메서드를 하나 정의하겠습니다
    private int checkEmpty() {   // 비어있는 배열의 index 넘버를 반환
        // 반복문을 사용하게 될겁니다 배열 내부에서 비어있는 index를 가져와야하니까
        // 그렇다면 순서대로 작동하는 반복문 특성상 웬만하면 가장 빠른 index가
        // return 되겠습니다.
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                return i;
            }
        }
        return -1;
        /*
            Java의 index 넘버에는 음수값이 없기 때문에(python에서는 마이너스인덱스개념이 있습니다),
            실패를 나타낼 때 -1을 쓰는 경우가 많습니다. 하지만 0과 너무 가까운 수이다 보니 -100이든지
            아예 return 값으로 나올 수 없을만한 음수를 지정하는 경우도 있는데,
            나중에 addDevice()메서드에 if(checkEmpty() == - 2914782)로 쓰고 싶지않으면
            -1 쓰는게 가장 보편적입니다.
         */
    }

    public void powerOn() {
        // 배열 내부에 있는 element들은(Power의 서브클래스들의 인스턴스) Power를 implment했기 때문에
        // 전부 .on()과 .off()를 공통적으로 가집니다.
        // 그러면 배열 내부를 반복문으로 돌려서 각각 .on()을 실행시켜야하겠네요.
        for (Power device : deviceArray) {
            if(device == null) {
                System.out.println("장치가 없어 전원을 켜지 않았습니다.");
                continue;           // 다음 반복문으로 건너뛰는 명령어 / break / return;과 비교할 것
            }
            device.on();
        }
    }

    public void powerOff() {
        // 켜는 걸 완성했으니까 기본적으로 deviceArray 내에 Power[] 배열 안에 이미 객체들이 저장돼있습니다.
        // 그러면 해야하는 건 배열 내부의 element들의 .off()를 실행시켜주는 것만 하면 됩니다.
        for(int i = 0 ; i < deviceArray.length ; i++) {
            if(deviceArray[i] == null) {
                System.out.println("장치가 없어 전원을 끄지 못합니다.");
                continue;
            }
            deviceArray[i].off();
        }
    }

    // 현재 배열 내에 각 객체들이 들어가있습니다.
    // 객체명.getClass().getSimpleName()을 활용하면 클래스 네임이 출력되는 것을 확인할 수 있습니다.
    // deviceArray를 반복문 돌려서 몇 번 인덱스에 어떤 클래스의 객체가 있는지를 표시하는
    // displayInfo() 메서드를 정의하시오.
    /*
        실행 예
        슬롯 [ 1 ] 번 : Computer
        슬롯 [ 2 ] 번 : LED
        슬롯 [ 3 ] 번 : Mouse
        슬롯 [ 4 ] 번 : Speaker
        슬롯 [ 5 ] 번 : Tv
        슬롯 [ 6 ] 번 : Empty
     */

    int[] intArr1 = { 1, 2, 3, 4, 5, 6 };



    public void displayInfo() {
        // element들 하나하나 출력하는데 실행결과 안녕하세요 로 콘솔에 출력
        for (int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null){
                System.out.println("슬롯 [ " + (i+1) + " ] 번 : Empty");
                continue;
            }
            System.out.println("슬롯 [ " + (i+1) + " ] 번 " + deviceArray[i].getClass().getSimpleName());
        }
    }

    // 배열 내부를 돌면서 각 element 의 고유 메서드를 호출하는 메서드
    public void performSpecificMethod(){
        for(Power device : deviceArray){
            if(device instanceof Tv){       // 얘가 실행된다면 배열 내부의 element 가 Tv 클래스로 생성되었다가 Power로 업캐스팅된 애라는 뜻
                Tv tv = (Tv)device; // 다운캐스팅은 명시적이어야하기 때문에
                tv.changeChannel();
            } else if(device instanceof Mouse){
                Mouse mouse = (Mouse)device;
                mouse.leftClick();
            } else if(device instanceof LED) {
                LED led = (LED)device;
                led.changeColor();
            } else if(device instanceof Speaker){
                Speaker speaker = (Speaker) device;
                speaker.changeEqual();
            } else if(device == null){                  // 장치가 비어있는 부분일 때 실행되는 부분
                System.out.println("장치가 비어있습니다.");
            }

            else {                                      // 아직 instanceof 연산자로 추가하지 못한 class
                System.out.println("아직 지원하지 않는 기기입니다.");
            }
        }
    }
}