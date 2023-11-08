public class LightSwitch {
    private LightBulb lightBulb;

    public LightSwitch() {
        this.lightBulb = new LightBulb();
    }

    public void press() {
        if (lightBulb.isOn()) {
            lightBulb.turnOff();
        } else {
            lightBulb.turnOn();
        }
    }
}