package Interfaces;
/*
    VolumeDownButton / VolumeUpButton 클래스를 생성하고
    얘를 TvRemoteController의 필드에 추가하고
    onPressedVolumeDownButton() / onDownVolumeDownButton()
    onPressedVolumeUpButton() / onUpVolumeUpButton() 메서드를 정의하시고
    Main 에서
    음량을 한 칸 내립니다.
    음량을 계속 내립니다.
    음량을 한 칸 올립니다.
    음량을 계속 올립니다.

 */
public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(), new ChannelDownButton(), new ChannelUpButton(), new VolumeDownButton(), new VolumeUpButton());

        ACController acController = new ACController(
                new PowerButton(), new TempDownButton(), new TempUpButton());


        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedChannelUpButton();
        tvRemoteController.onUpChannelUpButton();

        System.out.println();

        tvRemoteController.onUpVolumeUpButton();
        tvRemoteController.onPressedVolumeUpButton();
        tvRemoteController.onDownVolumeDownButton();
        tvRemoteController.onPressedVolumeDownButton();

        // 물론 메인으로 넘어와서 volumeUpbutton을 생성해서 기능을 동작시킬 수는 있습니다.
        VolumeUpButton volumeUpButton = new VolumeUpButton();
        System.out.println(volumeUpButton.onUp());      // 근데 얘가 논리적이지는 ㅏㄶ은 것 같다.
        // 기본적으로 TvRemoteController의 일부 기능으로 사용하기 위해 field로 쓰겠다.
        // 이 코드만 있는 것은 볼륨업 버튼'만' 존재하는 리모컨인 느낌

        /*
            과제 TempDownButton, TempUpButton, ACController 파일을 생성하고
            정의하여
            Main에 ACController 객체를 생성하고

            전원이 켜졌습니다

            온도를 한 칸 내립니다
            온도를 계속 내립니다

            온도를 한 칸 올립니다
            온도를 계속 올립니다

            전원이 꺼졌습니다.
         */
        System.out.println("------온도------");

        acController.onPressedPowerButton();

        System.out.println();

        acController.onPressedTempDownButton();
        acController.onDownTempDownButton();

        System.out.println();

        acController.onPressedTempUpButton();
        acController.onUpTempUpButton();

        System.out.println();

        acController.onPressedPowerButton();

    }
}



//        TVRemoteController tvRemoteController = new TVRemoteController(pb_객체_cd_객체_cu_객체);
