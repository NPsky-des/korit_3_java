package Interfaces;

public class ACController {
    private PowerButton powerButton;
    private TempDownButton tempDownButton;
    private TempUpButton tempUpButton;

    public ACController(PowerButton powerButton, TempDownButton tempDownButton, TempUpButton tempUpButton) {
        this.powerButton = powerButton;
        this.tempDownButton = tempDownButton;
        this.tempUpButton = tempUpButton;
    }

    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedTempDownButton() {
        tempDownButton.onPressed();
    }

    public void onDownTempDownButton() {
        tempDownButton.onDown();
    }

    // onPressedChannelUpButton() 메서드와 onUpChannelUpButton() 메서드를 구현하시오.
    // Main에서 둘 다 호출하시오.
    public void onPressedTempUpButton() {
        tempUpButton.onPressed();
    }

    public void onUpTempUpButton() {
        System.out.println(tempUpButton.onUp());
    }

}


