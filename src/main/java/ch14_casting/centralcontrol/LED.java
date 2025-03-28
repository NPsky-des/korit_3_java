package ch14_casting.centralcontrol;

public class LED implements Power{
    @Override
    public void on() {
        System.out.println("LED의 전원을 킵니다.");
    }

    @Override
    public void off() {
        System.out.println("LED의 전원을 끕니다.");
    }

    public void changeColor(){
        System.out.println("LED의 색깔을 변경합니다.");
    }
}
