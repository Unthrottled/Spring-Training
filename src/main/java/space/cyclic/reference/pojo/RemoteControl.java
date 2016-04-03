package space.cyclic.reference.pojo;

public class RemoteControl {
    private Battery battery;

    public RemoteControl(Battery battery) {
        this.battery = battery;
    }

    public RemoteControl() {
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}
